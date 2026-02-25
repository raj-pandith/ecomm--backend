FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ADD target/ecomm-java-backend.jar   ecomm-java-backend.jar   
ENTRYPOINT [ "java","-jar","/ecomm-java-backend.jar" ]

