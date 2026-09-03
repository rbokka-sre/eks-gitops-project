FROM tomcat:11-jdk17-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY app/target/eks-gitops-project.war \
     /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
