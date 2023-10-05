# 23-2-parcial-b-Juan-Villalobos-Juan-Viracacha

Comando Requerido para crear Dockerfile
En gitbash/CMD: docker build --build-arg JAR_FILE=build/libs/parcial-arquitectura-0.0.1-SNAPSHOT.jar -t myorg/myapp .
Y crear archivo en repo que contenga: 
FROM eclipse-temurin:11-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
