FROM tomcat:11-jdk17-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY app/target/gitops-demo.war \
     /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
