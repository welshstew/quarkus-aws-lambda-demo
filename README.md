## Configuring SAM for jvm

Note, that for JVM mode that `./target/sam.jvm.yaml` needs 512 MB, as per:  

```
  Resources:
    QuarkusAwsLambdaDemo:
      Type: AWS::Serverless::Function  
      Properties:
        Handler: io.quarkus.amazon.lambda.runtime.QuarkusStreamHandler::handleRequest
        Runtime: java11
        CodeUri: function.zip
        MemorySize: 512
        Timeout: 15
        Policies: AWSLambdaBasicExecutionRole

```

## Building and running in JVM mode in SAM:

```
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ mvn clean package
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< com.codergists:quarkus-aws-lambda-demo >---------------
[INFO] Building quarkus-aws-lambda-demo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ quarkus-aws-lambda-demo ---
[INFO] Deleting /home/user/Documents/fresh/quarkus-aws-lambda-demo/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ quarkus-aws-lambda-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ quarkus-aws-lambda-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ quarkus-aws-lambda-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ quarkus-aws-lambda-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.0:test (default-test) @ quarkus-aws-lambda-demo ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.codergists.LambdaHandlerTest
2020-06-29 13:19:45,119 INFO  [io.quarkus] (main) Quarkus 1.5.2.Final on JVM started in 2.371s. 
2020-06-29 13:19:45,120 INFO  [io.quarkus] (main) Profile test activated. 
2020-06-29 13:19:45,121 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
2020-06-29 13:19:45,366 WARN  [com.ama.aut.pro.int.BasicProfileConfigLoader] (Lambda Thread) Your profile name includes a 'profile ' prefix. This is considered part of the profile name in the Java SDK, so you will need to include this prefix in your profile name when you reference this profile from your Java code.
2020-06-29 13:19:45,596 WARN  [com.ama.aut.pro.int.BasicProfileConfigLoader] (Lambda Thread) Your profile name includes a 'profile ' prefix. This is considered part of the profile name in the Java SDK, so you will need to include this prefix in your profile name when you reference this profile from your Java code.
2020-06-29 13:19:45,627 INFO  [org.apa.cam.com.pro.PropertiesComponent] (Lambda Thread) PropertiesComponent added custom PropertiesSource (factory): org.apache.camel.component.microprofile.config.CamelMicroProfilePropertiesSource@307517f7
2020-06-29 13:19:45,690 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is starting
2020-06-29 13:19:45,690 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 13:19:45,982 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Route: route1 started and consuming from: direct://awsthing
2020-06-29 13:19:45,983 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Route: route2 started and consuming from: direct://thing
2020-06-29 13:19:45,983 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Total 2 routes, of which 2 are started
2020-06-29 13:19:45,983 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) started in 0.293 seconds
2020-06-29 13:19:45,992 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is shutting down
2020-06-29 13:19:45,993 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Lambda Thread) Starting to graceful shutdown 2 routes (timeout 45 seconds)
2020-06-29 13:19:45,997 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route2 shutdown complete, was consuming from: direct://thing
2020-06-29 13:19:45,999 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route1 shutdown complete, was consuming from: direct://awsthing
2020-06-29 13:19:45,999 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Lambda Thread) Graceful shutdown of 2 routes completed in 0 seconds
2020-06-29 13:19:46,004 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) uptime 0.314 seconds
2020-06-29 13:19:46,004 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is shutdown in 0.012 seconds
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.774 s - in com.codergists.LambdaHandlerTest
2020-06-29 13:19:46,039 INFO  [io.quarkus] (main) Quarkus stopped in 0.001s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ quarkus-aws-lambda-demo ---
[INFO] Building jar: /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- quarkus-maven-plugin:1.5.2.Final:build (default) @ quarkus-aws-lambda-demo ---
[INFO] [org.jboss.threads] JBoss Threads version 3.1.1.Final
[INFO] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Building fat jar: /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner.jar
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry language.properties entry from org.apache.camel:camel-bean::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-core-languages::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry component.properties entry from org.apache.camel:camel-bean::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-direct::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry component.properties entry from org.apache.camel:camel-aws-s3::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-direct::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry mime.types entry from software.amazon.awssdk:sdk-core::jar:2.11.14(compile) will be ignored. Existing file was provided by com.amazonaws:aws-java-sdk-s3::jar:1.11.714(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [software.amazon.awssdk:sdk-core::jar:2.11.14(compile), com.amazonaws:aws-java-sdk-s3::jar:1.11.714(compile)] contain duplicate files, e.g. mime.types
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [org.apache.camel:camel-bean::jar:3.3.0(compile), org.apache.camel:camel-direct::jar:3.3.0(compile), org.apache.camel:camel-aws-s3::jar:3.3.0(compile)] contain duplicate files, e.g. component.properties
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [org.apache.camel:camel-bean::jar:3.3.0(compile), org.apache.camel:camel-core-languages::jar:3.3.0(compile)] contain duplicate files, e.g. language.properties
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 7831ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  16.999 s
[INFO] Finished at: 2020-06-29T13:19:55+01:00
[INFO] ------------------------------------------------------------------------
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ sam local invoke --template target/sam.jvm.yaml --event payload.json
Invoking io.quarkus.amazon.lambda.runtime.QuarkusStreamHandler::handleRequest (java11)
Decompressing /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/function.zip

Fetching lambci/lambda:java11 Docker container image......
Mounting /tmp/tmpe6ocr42q as /var/task:ro,delegated inside runtime container
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2020-06-29 12:21:09,104 INFO  [io.quarkus] (main) quarkus-aws-lambda-demo 1.0-SNAPSHOT on JVM (powered by Quarkus 1.5.2.Final) started in 0.805s. 
2020-06-29 12:21:09,106 INFO  [io.quarkus] (main) Profile prod activated. 
2020-06-29 12:21:09,106 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
START RequestId: cf542e7e-338b-1f0c-044c-37a8bb6e754c Version: $LATEST
2020-06-29 12:21:09,764 INFO  [org.apa.cam.com.pro.PropertiesComponent] (main) PropertiesComponent added custom PropertiesSource (factory): org.apache.camel.component.microprofile.config.CamelMicroProfilePropertiesSource@2812b107
2020-06-29 12:21:09,848 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-2) is starting
2020-06-29 12:21:09,849 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 12:21:10,392 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route1 started and consuming from: direct://awsthing
2020-06-29 12:21:10,393 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route2 started and consuming from: direct://thing
2020-06-29 12:21:10,393 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Total 2 routes, of which 2 are started
2020-06-29 12:21:10,393 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-2) started in 0.545 seconds
2020-06-29 12:21:10,424 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-2) is shutting down
2020-06-29 12:21:10,426 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (main) Starting to graceful shutdown 2 routes (timeout 45 seconds)
2020-06-29 12:21:10,433 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route2 shutdown complete, was consuming from: direct://thing
2020-06-29 12:21:10,433 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route1 shutdown complete, was consuming from: direct://awsthing
2020-06-29 12:21:10,434 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (main) Graceful shutdown of 2 routes completed in 0 seconds
2020-06-29 12:21:10,439 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-2) uptime 0.590 seconds
2020-06-29 12:21:10,439 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-2) is shutdown in 0.015 seconds
END RequestId: cf542e7e-338b-1f0c-044c-37a8bb6e754c
REPORT RequestId: cf542e7e-338b-1f0c-044c-37a8bb6e754c	Init Duration: 1206.85 ms	Duration: 1330.76 ms	Billed Duration: 1400 ms	Memory Size: 512 MB	Max Memory Used: 121 MB	

{"result":"hello Bill","requestId":"cf542e7e-338b-1f0c-044c-37a8bb6e754c"}
```


## Building and running native in sam

```
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ mvn package -Pnative -Dnative-image.docker-build=true -Dquarkus.native.enable-jni=true
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< com.codergists:quarkus-aws-lambda-demo >---------------
[INFO] Building quarkus-aws-lambda-demo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ quarkus-aws-lambda-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ quarkus-aws-lambda-demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ quarkus-aws-lambda-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ quarkus-aws-lambda-demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.0:test (default-test) @ quarkus-aws-lambda-demo ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.codergists.LambdaHandlerTest
2020-06-29 12:43:46,228 INFO  [io.quarkus] (main) Quarkus 1.5.2.Final on JVM started in 2.952s. 
2020-06-29 12:43:46,229 INFO  [io.quarkus] (main) Profile test activated. 
2020-06-29 12:43:46,229 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
2020-06-29 12:43:46,513 WARN  [com.ama.aut.pro.int.BasicProfileConfigLoader] (Lambda Thread) Your profile name includes a 'profile ' prefix. This is considered part of the profile name in the Java SDK, so you will need to include this prefix in your profile name when you reference this profile from your Java code.
2020-06-29 12:43:46,752 WARN  [com.ama.aut.pro.int.BasicProfileConfigLoader] (Lambda Thread) Your profile name includes a 'profile ' prefix. This is considered part of the profile name in the Java SDK, so you will need to include this prefix in your profile name when you reference this profile from your Java code.
2020-06-29 12:43:46,800 INFO  [org.apa.cam.com.pro.PropertiesComponent] (Lambda Thread) PropertiesComponent added custom PropertiesSource (factory): org.apache.camel.component.microprofile.config.CamelMicroProfilePropertiesSource@43bc78e6
2020-06-29 12:43:46,880 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is starting
2020-06-29 12:43:46,881 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 12:43:47,377 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Route: route1 started and consuming from: direct://awsthing
2020-06-29 12:43:47,379 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Route: route2 started and consuming from: direct://thing
2020-06-29 12:43:47,379 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Total 2 routes, of which 2 are started
2020-06-29 12:43:47,382 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) started in 0.499 seconds
2020-06-29 12:43:47,403 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is shutting down
2020-06-29 12:43:47,410 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Lambda Thread) Starting to graceful shutdown 2 routes (timeout 45 seconds)
2020-06-29 12:43:47,425 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route2 shutdown complete, was consuming from: direct://thing
2020-06-29 12:43:47,425 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Camel (camel-2) thread #0 - ShutdownTask) Route: route1 shutdown complete, was consuming from: direct://awsthing
2020-06-29 12:43:47,426 INFO  [org.apa.cam.imp.eng.DefaultShutdownStrategy] (Lambda Thread) Graceful shutdown of 2 routes completed in 0 seconds
2020-06-29 12:43:47,429 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) uptime 0.549 seconds
2020-06-29 12:43:47,429 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (Lambda Thread) Apache Camel 3.3.0 (CamelContext: camel-2) is shutdown in 0.026 seconds
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.463 s - in com.codergists.LambdaHandlerTest
2020-06-29 12:43:47,499 INFO  [io.quarkus] (main) Quarkus stopped in 0.010s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ quarkus-aws-lambda-demo ---
[INFO] Building jar: /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- quarkus-maven-plugin:1.5.2.Final:build (default) @ quarkus-aws-lambda-demo ---
[INFO] [org.jboss.threads] JBoss Threads version 3.1.1.Final
[INFO] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Building fat jar: /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner.jar
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry language.properties entry from org.apache.camel:camel-bean::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-core-languages::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry component.properties entry from org.apache.camel:camel-bean::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-direct::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry component.properties entry from org.apache.camel:camel-aws-s3::jar:3.3.0(compile) will be ignored. Existing file was provided by org.apache.camel:camel-direct::jar:3.3.0(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Duplicate entry mime.types entry from software.amazon.awssdk:sdk-core::jar:2.11.14(compile) will be ignored. Existing file was provided by com.amazonaws:aws-java-sdk-s3::jar:1.11.714(compile)
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [software.amazon.awssdk:sdk-core::jar:2.11.14(compile), com.amazonaws:aws-java-sdk-s3::jar:1.11.714(compile)] contain duplicate files, e.g. mime.types
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [org.apache.camel:camel-bean::jar:3.3.0(compile), org.apache.camel:camel-direct::jar:3.3.0(compile), org.apache.camel:camel-aws-s3::jar:3.3.0(compile)] contain duplicate files, e.g. component.properties
[WARNING] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Dependencies with duplicate files detected. The dependencies [org.apache.camel:camel-bean::jar:3.3.0(compile), org.apache.camel:camel-core-languages::jar:3.3.0(compile)] contain duplicate files, e.g. language.properties
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 8082ms
[INFO] 
[INFO] --- quarkus-maven-plugin:1.5.2.Final:native-image (default) @ quarkus-aws-lambda-demo ---
[INFO] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Building native image source jar: /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT-native-image-source-jar/quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner.jar
[INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] Building native image from /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT-native-image-source-jar/quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner.jar
[INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] Pulling image quay.io/quarkus/ubi-quarkus-native-image:19.3.1-java11
19.3.1-java11: Pulling from quarkus/ubi-quarkus-native-image
Digest: sha256:9e2dd59c82db091bb90fd0ee60530291a5ecc201ebc718ffcc59ab0f406e47ea
Status: Image is up to date for quay.io/quarkus/ubi-quarkus-native-image:19.3.1-java11
quay.io/quarkus/ubi-quarkus-native-image:19.3.1-java11
[INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] Running Quarkus native-image plugin on GraalVM Version 19.3.1 CE
[INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] docker run -v /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/quarkus-aws-lambda-demo-1.0-SNAPSHOT-native-image-source-jar:/project:z --env LANG=C --user 1000:1000 --rm quay.io/quarkus/ubi-quarkus-native-image:19.3.1-java11 -J-Djava.util.logging.manager=org.jboss.logmanager.LogManager -J-Dsun.nio.ch.maxUpdateArraySize=100 -J-Dcom.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true -J-Dio.netty.leakDetection.level=DISABLED -J-Dio.netty.allocator.maxOrder=1 -J-Duser.language=en -J-Dfile.encoding=UTF-8 --initialize-at-build-time= -H:InitialCollectionPolicy=com.oracle.svm.core.genscavenge.CollectionPolicy$BySpaceAndTime -H:+JNI -jar quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner.jar -H:FallbackThreshold=0 -H:+ReportExceptionStackTraces -H:-AddAllCharsets -H:-IncludeAllTimeZones -H:EnableURLProtocols=http,https --enable-all-security-services --no-server -H:-UseServiceLoaderFeature -H:+StackTrace quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    classlist:   7,675.86 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        (cap):     966.25 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        setup:   2,359.23 ms
11:45:07,028 INFO  [org.jbo.threads] JBoss Threads version 3.1.1.Final
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]   (typeflow): 128,915.82 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    (objects):  75,653.95 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]   (features):   2,700.40 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     analysis: 212,343.91 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     (clinit):   1,584.11 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     universe:   4,888.86 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      (parse):   7,033.16 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     (inline):  10,292.35 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    (compile):  49,017.00 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      compile:  70,716.40 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        image:   8,081.70 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        write:   1,170.16 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      [total]: 308,206.39 ms
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 318414ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  05:35 min
[INFO] Finished at: 2020-06-29T12:49:15+01:00
[INFO] ------------------------------------------------------------------------
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ sam local invoke --template target/sam.native.yaml --event payload.json
Invoking not.used.in.provided.runtime (provided)
Decompressing /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/function.zip

Fetching lambci/lambda:provided Docker container image......
Mounting /tmp/tmpmbcywrbu as /var/task:ro,delegated inside runtime container
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2020-06-29 12:12:38,052 INFO  [io.quarkus] (main) quarkus-aws-lambda-demo 1.0-SNAPSHOT native (powered by Quarkus 1.5.2.Final) started in 0.008s. 
2020-06-29 12:12:38,053 INFO  [io.quarkus] (main) Profile prod activated. 
2020-06-29 12:12:38,053 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
START RequestId: dc45f3b7-836a-1e59-49bd-01fed6bce751 Version: $LATEST
2020-06-29 12:12:38,061 ERROR [io.qua.ama.lam.run.AbstractLambdaPollLoop] (Lambda Thread) Failed to run lambda: org.apache.camel.NoSuchLanguageException: No language could be found for: simple
	at org.apache.camel.impl.engine.DefaultLanguageResolver.noSpecificLanguageFound(DefaultLanguageResolver.java:92)
	at org.apache.camel.impl.engine.DefaultLanguageResolver.resolveLanguage(DefaultLanguageResolver.java:68)
	at org.apache.camel.impl.engine.AbstractCamelContext.resolveLanguage(AbstractCamelContext.java:1745)
	at org.apache.camel.impl.engine.AbstractCamelContext.doStartStandardServices(AbstractCamelContext.java:3545)
	at org.apache.camel.impl.DefaultCamelContext.doStartStandardServices(DefaultCamelContext.java:297)
	at org.apache.camel.impl.engine.AbstractCamelContext.forceLazyInitialization(AbstractCamelContext.java:3488)
	at org.apache.camel.impl.engine.AbstractCamelContext.doInit(AbstractCamelContext.java:2555)
	at org.apache.camel.support.service.BaseService.init(BaseService.java:83)
	at org.apache.camel.impl.engine.AbstractCamelContext.init(AbstractCamelContext.java:2450)
	at org.apache.camel.support.service.BaseService.start(BaseService.java:111)
	at org.apache.camel.impl.engine.AbstractCamelContext.start(AbstractCamelContext.java:2467)
	at com.codergists.TestLambda.handleRequest(TestLambda.java:54)
	at com.codergists.TestLambda.handleRequest(TestLambda.java:16)
	at io.quarkus.amazon.lambda.runtime.AmazonLambdaRecorder$1.processRequest(AmazonLambdaRecorder.java:148)
	at io.quarkus.amazon.lambda.runtime.AbstractLambdaPollLoop$1.run(AbstractLambdaPollLoop.java:78)
	at java.lang.Thread.run(Thread.java:834)
	at com.oracle.svm.core.thread.JavaThreads.threadStartRoutine(JavaThreads.java:497)
	at com.oracle.svm.core.posix.thread.PosixJavaThreads.pthreadStartRoutine(PosixJavaThreads.java:193)

END RequestId: dc45f3b7-836a-1e59-49bd-01fed6bce751
REPORT RequestId: dc45f3b7-836a-1e59-49bd-01fed6bce751	Init Duration: 209.87 ms	Duration: 9.87 ms	Billed Duration: 100 ms	Memory Size: 128 MB	Max Memory Used: 55 MB	

{"errorType":"org.apache.camel.NoSuchLanguageException","errorMessage":"No language could be found for: simple"}
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ 
```