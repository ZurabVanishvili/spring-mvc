<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>

</head>
<body>

<form:form action="processForm" modelAttribute="student">
    First Name : <form:input path="firstName"/>
    <br><br>
    Last Name : <form:input path="lastName"/>

    <br><br>

    Country :
    <form:select path="country">

        <form:options items="${student.countryOptions}"/>

    </form:select>



    <br><br>

    Favorite Programming Language:

    <br>

    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
    Python <form:radiobutton path="favoriteLanguage" value="Python"/>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>


</body>
</html>
