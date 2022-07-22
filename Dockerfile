FROM openjdk:8
ADD target/matrimonial.jar matrimonial.jar
ENTRYPOINT ["java", "-jar","matrimonial.jar"]
EXPOSE 8080