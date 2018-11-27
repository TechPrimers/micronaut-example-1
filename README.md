# Micronaut Example - WebSerivce in the JVM with 10MB Memory

This is our first Hello World program using Micronaut

## Command Line
- `brew install micronaut` - installs the CLI
- `mn create-app micronaut-example` - creates the app in one go
- `mn create-controller HelloController` - creates the REST controller with Test file

## Run the program
- `./gradlew clean build` - creates the artifacts under `/build/libs`
- `java -jar build/libs/micronaut-example-1.0-all.jar` - Fat Jar for starting the microservice
