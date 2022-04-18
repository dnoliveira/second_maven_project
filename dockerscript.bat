./mvnw clean package -DskipTests
docker build -t spring-app .
docker images
docker run -p 8080:8080 spring-app