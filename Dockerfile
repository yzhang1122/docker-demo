FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app
WORKDIR /app
COPY ./target/docker-demo-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java"]
CMD ["-jar", "app.jar"]
