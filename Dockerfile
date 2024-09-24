FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the build context to the container
COPY build/libs/product-0.0.1-SNAPSHOT.jar product.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java","-jar","product.jar"]