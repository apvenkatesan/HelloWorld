FROM openjdk:11
EXPOSE 8080
ADD target/helloworld.jar helloworld.jar
ENTRYPOINT ["java","jar","/helloword.jar"]
