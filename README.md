springloaded-jasper-test
========================

Test application in order to reproduce spring-loaded issues with Jasper JSP engine.

How to reproduce the issue
--------------------------

1. build the project

> mvn clean install

2. set the MVN_OPTS environment variable in order to add Spring-loaded as agent for yor application

> export MVN_OPTS="-javaagent:lib/springloaded-1.2.0.BUILD-SNAPSHOT.jar -noverify"

3. launch jetty

> mvn jetty:run

4. open a browser and access the [application](http://localhost:8080/springloaded-jasper-test/).
At this stage, the index.jsp won't compile and you'll get the following error:

> PWC6197: An error occurred at line: 9 in the jsp file: /index.jsp
> PWC6199: Generated servlet error:
> cannot find symbol
>    symbol:   method getItalianGreeting()
>    location: variable bean of type test.GreetingsBean

5. go back to the source code, uncomment the "getItalianGreeting" method in the test.GreetingsBean class and recompile that class.

6. refresh the application page. You should receive the following error:

> java.lang.NoSuchMethodError: test.GreetingsBean.getItalianGreeting()Ljava/lang/String;
>   	at org.apache.jsp.index_jsp._jspService(index_jsp.java:63)
>   	at org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:111)
>   	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
>   	at org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:411)
>   	at org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:473)
>   	at org.apache.jasper.servlet.JspServlet.service(JspServlet.java:377)
>   	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)

