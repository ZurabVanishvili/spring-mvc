<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 1/24/2023
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>


<i> Fill out the form. * means required </i>
<form:form action="processForm" modelAttribute="customer">
    <br><br>
    First Name : <form:input path="firstName"/>

    <br><br>
    Last Name : <form:input path="lastName"/>

    <form:errors path="lastName" cssClass="error"/>

    <br><br>
    Free Passes : <form:input path="freePasses" />
    <form:errors path="freePasses" cssClass="error"/>

    <br><br>
    Postal Code : <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>

    <br><br>

    Course Code : <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>

    <br><br>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>
