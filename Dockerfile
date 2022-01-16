FROM adoptopenjdk/openjdk11:jre-11.0.13_8-alpine

EXPOSE 8080

COPY build/libs/spring_rest-0.0.1-SNAPSHOT.jar spring_rest1.jar

CMD ["java", "-jar", "/spring_rest1.jar  "]