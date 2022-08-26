#Start with based image
FROM adoptopenjdk/openjdk8:ubi

MAINTAINER isoft.com

copy target/accounts-1.0.0.jar accounts-1.0.0.jar

#execute the application
ENTRYPOINT ["java","-jar","/accounts-1.0.0.jar"]