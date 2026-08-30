FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY Helloworld.java .

RUN javac Helloworld.java

EXPOSE 8080

CMD ["java", "Helloworld"]