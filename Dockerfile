FROM eclipse-temurin:18-jdk
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
ENV MYSQL_DATABASE=exam \
    MYSQL_USER=root \
    MYSQL_PASSWORD=123456 \
    MYSQL_HOST=mysql
ENTRYPOINT ["java", "-jar", "target/your-application.jar"]
