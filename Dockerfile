FROM openjdk:11-oracle
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.war
COPY ${JAR_FILE} demo-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.war"]