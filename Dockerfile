FROM eclipse-temurin:17
COPY target/RestApp2.jar RestApp2.jar
CMD ["java", "-jar", "RestApp2.jar]