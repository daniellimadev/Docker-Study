FROM openjdk

WORKDIR /app

COPY target/api-ping-0.0.1-SNAPSHOT.jar /app/api-ping.jar

ENTRYPOINT ["java", "-jar", "api-ping"]