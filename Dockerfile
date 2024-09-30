FROM openjdk:21
COPY build/libs/product-0.0.1-SNAPSHOT.jar product.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "/product.jar"]