FROM eclipse-temurin:21-jre
LABEL authors="maxime"
ARG JAR_FILE=target/*.jar
COPY ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
