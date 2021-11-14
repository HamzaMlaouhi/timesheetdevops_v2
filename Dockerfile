FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD /target/timesheet-devopsv2-0.0.1.jar timesheet-devopsv2-0.0.1.jar
ENTRYPOINT ["java", "-jar", "timesheet-devopsv2-0.0.1.jar"]
