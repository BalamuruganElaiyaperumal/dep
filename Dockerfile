FROM eclipse-temurin:17
COPY target/File.jar File.jar
CMD [ "java","-jar","file.jar" ]