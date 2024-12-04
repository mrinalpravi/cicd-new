FROM openjdk:17-jdk-slim
WORKDIR /app
COPY /home/runner/work/cicd-new/cicd-new/target/springdemo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]
