#FROM openjdk:22
#EXPOSE 9090
#ADD target/docker-demo.jar docker-demo.jar
#ENTRYPOINT ["java","-jar","/docker-demo.jar"]

# Use an official OpenJDK image as the base image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the build context to the container
COPY build/libs/my-docker-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the Spring Boot app runs on
EXPOSE 8080

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]