# Use an official Ubuntu image as the base image
FROM ubuntu:latest

# Set labels for the application and author
LABEL JAVA_TOMCAT="app"
LABEL author="Prudhvisurya"

# Install OpenJDK 11, Git, and Tomcat
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk git && \
    apt-get install -y tomcat9 && \
    apt-get clean


# Clone the GitHub repository
RUN git clone https://github.com/Prudhvisurya/Java-Tomcat.git 

# Compile the Java code
RUN javac -classpath /usr/share/tomcat9/lib/servlet-api.jar /JAVATOM.APP/UserDetailsServlet.java

# Copy compiled UserDetailsServlet.class to the Tomcat classes directory
RUN cp /JAVATOM.APP/UserDetailsServlet.class /var/lib/tomcat9/webapps/my-web-app/WEB-INF/classes/ 
# Copy web.xml, index.html, and userdetails.jsp to respective locations
RUN cp /JAVATOM.APP/web.xml /var/lib/tomcat9/webapps/my-web-app/WEB-INF/
RUN cp /JAVATOM.APP/index.html /JAVATOM.APP/userdetails.jsp /var/lib/tomcat9/webapps/my-web-app/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]

# Echo a message about deployment
RUN echo "App is deployed in Tomcat server. To access the application, use publicip:8080/my-web-app"

