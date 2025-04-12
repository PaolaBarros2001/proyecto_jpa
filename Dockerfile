FROM openjdk:17-jdk-slim

WORKDIR /app

COPY out/artifacts/jpa_jar/jpa.jar /app/app_spring.jar

EXPOSE 8083

CMD ["java", "-jar", "app_spring.jar"]
