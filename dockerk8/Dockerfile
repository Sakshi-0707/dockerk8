FROM java:17

EXPOSE 8080

ADD target/dockerk8.jar dockerk8.jar

ENTRYPOINT ["java","-jar","dockerk8.jar"]