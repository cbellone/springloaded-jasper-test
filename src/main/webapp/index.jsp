<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bean" class="test.GreetingsBean" scope="request"/>
<html>
<head>
    <title>This JSP won't compile until "getItalianGreeting()" method is commented out</title>
</head>
<body>
<h1>English: <%= bean.getEnglishGreeting() %></h1>
<h1>Italian: <%= bean.getItalianGreeting() %></h1>
</body>
</html>
