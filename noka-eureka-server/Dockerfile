FROM openjdk:8-jdk-alpine
MAINTAINER nokavietnam.com
COPY target/noka-eureka-server-1.0.0.jar noka-eureka-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/noka-eureka-server-1.0.0.jar"]




# docker build --tag=message-server:latest
# docker run -p8887:8888 message-server:latest
# docker inspect message-server
# docker stop message-server
# docker rm message-server