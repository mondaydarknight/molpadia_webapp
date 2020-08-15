FROM openjdk:11
MAINTAINER mongche.lee@gmail.com
VOLUME /tmp
EXPOSE 8080
ADD build/libs/molpadia_webapp.jar molpadia_webapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/molpadia_webapp.jar"]
