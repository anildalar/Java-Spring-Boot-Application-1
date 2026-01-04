FROM eclipse-temurin:17-jdk

WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy only pom.xml first (dependency caching)
COPY pom.xml .

# Download dependencies (cached layer)
RUN mvn dependency:go-offline

# App port
EXPOSE 8080

# Run Spring Boot directly
CMD ["mvn","spring-boot:run"]
