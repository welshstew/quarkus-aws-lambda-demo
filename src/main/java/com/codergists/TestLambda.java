package com.codergists;

import javax.inject.Inject;
import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import org.apache.camel.ProducerTemplate;


@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

    // @Inject
    // S3Client s3Client;

    // @Inject
    // MyRouteBuilder myRouteBuilder;    
    
    @Inject
    ProducerTemplate pt;



    // @Inject
    // CamelContext ctx;

    // @Inject
    // ProcessingService processingService;


    @Override
    public OutputObject handleRequest(InputObject input, Context context) {

        // final AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        // .withRegion("eu-west-2")
        // .build();

        // final CamelContext ctx = new DefaultCamelContext();
        // ctx.getRegistry().bind("processingService", processingService);
        // try {
		// 	ctx.addRoutes(myRouteBuilder);
		// } catch (Exception e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
        // }       
        // ctx.start();
        // ProducerTemplate pt = ctx.createProducerTemplate();
        // pt.start();
        // ctx.start();
        OutputObject outputObjectOut = (OutputObject) pt.requestBody("direct:thing", input);
        // ctx.shutdown();
        outputObjectOut.setRequestId(context.getAwsRequestId());

        return outputObjectOut;
        // return service.process(input).setRequestId(context.getAwsRequestId());
    }
}
