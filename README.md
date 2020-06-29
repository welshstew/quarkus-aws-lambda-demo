
## Running in sam jvm mode

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
2020-06-29 14:18:56,246 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is starting
2020-06-29 14:18:56,255 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 14:18:56,273 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route1 started and consuming from: direct://thing
2020-06-29 14:18:56,273 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Total 1 routes, of which 1 are started
2020-06-29 14:18:56,274 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) started in 0.026 seconds
2020-06-29 14:18:56,275 INFO  [io.quarkus] (main) Quarkus 1.5.2.Final on JVM started in 2.542s. 
2020-06-29 14:18:56,275 INFO  [io.quarkus] (main) Profile test activated. 
2020-06-29 14:18:56,275 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.206 s - in com.codergists.LambdaHandlerTest
2020-06-29 14:18:56,449 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is shutting down
2020-06-29 14:18:56,455 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) uptime 0.208 seconds
2020-06-29 14:18:56,455 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is shutdown in 0.006 seconds
2020-06-29 14:18:56,460 INFO  [io.quarkus] (main) Quarkus stopped in 0.011s
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
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 7784ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  16.687 s
[INFO] Finished at: 2020-06-29T14:19:05+01:00
[INFO] ------------------------------------------------------------------------
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ sam local invoke --template target/sam.jvm.yaml --event payload.json
Invoking io.quarkus.amazon.lambda.runtime.QuarkusStreamHandler::handleRequest (java11)
Decompressing /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/function.zip

Fetching lambci/lambda:java11 Docker container image......
Mounting /tmp/tmp1mxoeuxt as /var/task:ro,delegated inside runtime container
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2020-06-29 13:19:21,157 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is starting
2020-06-29 13:19:21,159 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 13:19:21,183 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route1 started and consuming from: direct://thing
2020-06-29 13:19:21,185 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Total 1 routes, of which 1 are started
2020-06-29 13:19:21,186 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) started in 0.028 seconds
2020-06-29 13:19:21,187 INFO  [io.quarkus] (main) quarkus-aws-lambda-demo 1.0-SNAPSHOT on JVM (powered by Quarkus 1.5.2.Final) started in 1.023s. 
2020-06-29 13:19:21,188 INFO  [io.quarkus] (main) Profile prod activated. 
2020-06-29 13:19:21,189 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
START RequestId: 51945485-6cce-1a69-d27d-17bde22b7ce1 Version: $LATEST
END RequestId: 51945485-6cce-1a69-d27d-17bde22b7ce1
REPORT RequestId: 51945485-6cce-1a69-d27d-17bde22b7ce1	Init Duration: 1459.94 ms	Duration: 57.71 ms	Billed Duration: 100 ms	Memory Size: 256 MB	Max Memory Used: 91 MB	

{"result":"hello Bill","requestId":"51945485-6cce-1a69-d27d-17bde22b7ce1"}
```


## Building and running in sam native mode

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
2020-06-29 14:20:39,281 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is starting
2020-06-29 14:20:39,283 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 14:20:39,303 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route1 started and consuming from: direct://thing
2020-06-29 14:20:39,303 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Total 1 routes, of which 1 are started
2020-06-29 14:20:39,304 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) started in 0.020 seconds
2020-06-29 14:20:39,304 INFO  [io.quarkus] (main) Quarkus 1.5.2.Final on JVM started in 2.597s. 
2020-06-29 14:20:39,305 INFO  [io.quarkus] (main) Profile test activated. 
2020-06-29 14:20:39,305 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.982 s - in com.codergists.LambdaHandlerTest
2020-06-29 14:20:39,490 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is shutting down
2020-06-29 14:20:39,494 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) uptime 0.211 seconds
2020-06-29 14:20:39,494 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is shutdown in 0.004 seconds
2020-06-29 14:20:39,498 INFO  [io.quarkus] (main) Quarkus stopped in 0.008s
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
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 7800ms
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
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    classlist:   7,600.57 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        (cap):     951.59 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        setup:   2,315.89 ms
13:22:02,315 INFO  [org.jbo.threads] JBoss Threads version 3.1.1.Final
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]   (typeflow): 165,316.85 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    (objects):  73,393.96 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]   (features):   2,799.89 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     analysis: 246,808.60 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     (clinit):   1,801.82 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     universe:   4,852.02 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      (parse):   7,344.06 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]     (inline):   9,664.08 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]    (compile):  52,870.06 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      compile:  74,083.06 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        image:   8,191.44 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]        write:   1,109.95 ms
[quarkus-aws-lambda-demo-1.0-SNAPSHOT-runner:24]      [total]: 345,961.18 ms
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 356447ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  06:10 min
[INFO] Finished at: 2020-06-29T14:26:45+01:00
[INFO] ------------------------------------------------------------------------
user@user-ubuntuvm:~/Documents/fresh/quarkus-aws-lambda-demo$ sam local invoke --template target/sam.native.yaml --event payload.json
Invoking not.used.in.provided.runtime (provided)
Decompressing /home/user/Documents/fresh/quarkus-aws-lambda-demo/target/function.zip

Fetching lambci/lambda:provided Docker container image......
Mounting /tmp/tmpifd0jhu_ as /var/task:ro,delegated inside runtime container
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2020-06-29 13:30:42,324 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) is starting
2020-06-29 13:30:42,325 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2020-06-29 13:30:42,325 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Route: route1 started and consuming from: direct://thing
2020-06-29 13:30:42,325 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Total 1 routes, of which 1 are started
2020-06-29 13:30:42,325 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.3.0 (CamelContext: camel-1) started in 0.000 seconds
2020-06-29 13:30:42,326 INFO  [io.quarkus] (main) quarkus-aws-lambda-demo 1.0-SNAPSHOT native (powered by Quarkus 1.5.2.Final) started in 0.012s. 
2020-06-29 13:30:42,326 INFO  [io.quarkus] (main) Profile prod activated. 
2020-06-29 13:30:42,326 INFO  [io.quarkus] (main) Installed features: [amazon-lambda, amazon-s3, camel-aws-commons, camel-aws-s3, camel-bean, camel-core, camel-direct, camel-support-common, camel-support-commons-logging, camel-support-xml, cdi]
START RequestId: b894fab4-41c8-1c35-b870-10202ad6b600 Version: $LATEST
END RequestId: b894fab4-41c8-1c35-b870-10202ad6b600
REPORT RequestId: b894fab4-41c8-1c35-b870-10202ad6b600	Init Duration: 211.89 ms	Duration: 3.00 ms	Billed Duration: 100 ms	Memory Size: 128 MB	Max Memory Used: 49 MB	

{"result":"hello Bill","requestId":"b894fab4-41c8-1c35-b870-10202ad6b600"}

```