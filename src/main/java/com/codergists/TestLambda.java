package com.codergists;

import javax.inject.Inject;
import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;


@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

    // @Inject
    // S3Client s3Client;

    @Inject
    MyRouteBuilder myRouteBuilder;    
    
    @Inject
    ProducerTemplate pt;



    // @Inject
    // CamelContext ctx;

    @Inject
    ProcessingService processingService;


    @Override
    public OutputObject handleRequest(InputObject input, Context context) {

        final AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        .withRegion("eu-west-2")
        .build();

        final CamelContext ctx = new DefaultCamelContext();
        ctx.getRegistry().bind("processingService", processingService);
        ctx.getRegistry().bind("s3", s3Client);

        try {
			ctx.addRoutes(myRouteBuilder);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }       
        ctx.start();
        pt = ctx.createProducerTemplate();
        pt.start();

        OutputObject outputObjectOut = (OutputObject) pt.requestBody("direct:thing", input);
        ctx.shutdown();
        outputObjectOut.setRequestId(context.getAwsRequestId());

        return outputObjectOut;
        // return service.process(input).setRequestId(context.getAwsRequestId());
    }
}
