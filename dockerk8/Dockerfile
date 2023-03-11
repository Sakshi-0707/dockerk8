FROM openjdk:17


ADD target/dockerk8.jar dockerk8.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","dockerk8.jar"]