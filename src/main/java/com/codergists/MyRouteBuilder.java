package com.codergists;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import software.amazon.awssdk.services.s3.S3Client;
import org.apache.camel.impl.DefaultCamelContext;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import io.quarkus.runtime.annotations.RegisterForReflection;


@ApplicationScoped
public class MyRouteBuilder extends RouteBuilder {
    
    // @Inject
    // S3Client s3Client;

    // public MyRouteBuilder(S3Client s3Client){
    //     this.s3Client = s3Client;
    // }

    @Override
	public void configure() throws Exception {

        // final AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        // .withRegion("eu-west-2")
        // .build();

        // this.getContext().getRegistry().bind("amazonS3Client", s3Client);


        from("direct:awsthing")
        .setProperty("InputObject", simple("${body}"))
        .setHeader("CamelAwsS3Key", constant("{{key.name}}"))
        .setHeader("CamelAwsS3BucketName", constant("{{bucket.name}}"))
        .to("aws-s3://swinchestest-input?operation=getObject")
        .convertBodyTo(String.class)
        .log("${body}").process(new Processor(){
        
            @Override
            public void process(Exchange exchange) throws Exception {
                InputObject inputObject = (InputObject) exchange.getProperty("InputObject");
                inputObject.setGreeting("Hello");
                exchange.getIn().setBody(inputObject);
            }
        })
        .to("bean:processingService?method=doStuff");


        from("direct:thing")
        .to("bean:processingService?method=doStuff");

    }
}