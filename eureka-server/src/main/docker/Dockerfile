FROM java:8
VOLUME /Users/maze/Docker/:/spring-cloud-eureka
ADD eureka-server-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Xms128m","-Xmx256m","-Djava.security.egb=file:/dev/./urandom/","-jar","/app.jar"]