FROM tomcat

ENV DIR_WEBAPP /usr/local/tomcat/webapps/

RUN  mkdir -p $DIR_WEBAPP

ADD target/*.war $DIR_WEBAPP/ROOT.war

CMD ["catalina.sh", "run"]
