# java-func-accelerator

This repo provides a simple web app based on Spring Boot and Spring Cloud Function that uses rest api to retrieve stock information.

It can be deployed as a standalone web app, as a Kubernetes Deployment and Service, or as a Knative Service.

## The code

> **NOTE**: The project is configured for Java 11, if you are using Java 8, then modify the `java.version` property in `pom.xml`.

The project contains the following code layout:

```text
.
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── javafunc
    │   │               └── JavaFuncApplication.java
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── com
                └── example
                    └── javafunc
                        └── JavaFuncApplicationTests.java
```

It also contains some deployment manifests, depending on the deploymentType selected when generating the project.

You can modify the source code using [Visual Studio Code](https://code.visualstudio.com/):

```bash
code .
```

The Function that is used by this app is located at `src/main/java/com/example/javafunc/JavaFuncApplication.java`

You can build the project using the provided Maven wrapper:

```bash
./mvnw clean package
```

## Standalone app with embedded Tomcat server

To run the app using the embedded Tomcat server you can run this command:

```bash
./mvnw spring-boot:run
```

You can access the function using `curl`:

```bash
curl -w'\n' -H 'Content-Type: text/plain' localhost:8080 -d "Fun"
```


### Accessing the app deployed to your cluster

If you don't have `curl` installed it can be installed using downloads here: https://curl.se/download.html

To invoke the deployed function run the following `curl` command in another terminal window:

```
curl localhost:8080 -w'\n' -H 'Content-Type: text/plain' -d Fun
```
