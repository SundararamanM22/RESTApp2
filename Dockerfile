FROM eclipse-temurin:17
COPY target/RestApp2.Jar RestApp2.Jar
CMD ["java", "-jar", "RestApp2.Jar]