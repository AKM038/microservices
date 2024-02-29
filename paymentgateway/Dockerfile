FROM openjdk:17
WORKDIR /
ADD target/paymentgateway-0.0.1-SNAPSHOT.jar paymentgateway-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","paymentgateway-0.0.1-SNAPSHOT.jar"]