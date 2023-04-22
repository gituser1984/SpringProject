FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-server-config.jar
ENTRYPOINT [ "java","-jar","/cloud-server-config.jar" ]
EXPOSE 9296