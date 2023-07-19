FROM openjdk:17-jdk-slim
EXPOSE 8100
COPY currency-conversion-service-1.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]