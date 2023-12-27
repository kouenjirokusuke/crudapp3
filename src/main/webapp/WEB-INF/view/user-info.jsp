<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>User info</title>
</head>
<body>
    <h2>User info</h2>
    <br>
    <form:form action="save" modelAttribute="user">
        <form:hidden path="id"/>

        Name <form:input path="name" /><br><br>
        Email <form:input path="email" /><br><br>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>
