FROM openjdk:17-jdk-slim
WORKDIR /app
COPY jpa/target/jpa-0.0.1-SNAPSHOT.jar /app/app_spring.jar
ENTRYPOINT ["java", "-jar", "/app/app_spring.jar"]
