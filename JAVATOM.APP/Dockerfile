# Use an official Tomcat image as the base image
FROM tomcat:9.0

# Set labels for the application and author
LABEL JAVA_TOMCAT="app"
LABEL author="Prudhvisurya"

# Install OpenJDK 11 and Git
RUN apt-get update && apt-get install -y openjdk-11-jdk git && apt-get clean

# Clone the repository
RUN git clone -b java-Tomcat https://github.com/Prudhvisurya/Java-Tomcat.git /JAVATOM.APP

# Compile the Java code
RUN cd /JAVATOM.APP/src/main/java && javac -classpath /usr/local/tomcat/lib/servlet-api.jar UserDetailsServlet.java

# Copy files to respective locations
RUN cp /JAVATOM.APP/src/main/java/UserDetailsServlet.class /usr/local/tomcat/webapps/my-web-app/WEB-INF/classes/
RUN cp /JAVATOM.APP/src/main/webapp/WEB-INF/web.xml /usr/local/tomcat/webapps/my-web-app/WEB-INF/
RUN cp /JAVATOM.APP/src/main/webapp/index.html /JAVATOM.APP/src/main/webapp/userdetails.jsp /usr/local/tomcat/webapps/my-web-app/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]

# Echo a message about deployment
RUN echo "App is deployed in Tomcat server. To access the application, use publicip:8080/my-web-app"

