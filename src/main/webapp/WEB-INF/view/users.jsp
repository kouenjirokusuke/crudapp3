<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Users</title>
</head>
<body>
    <h2>All users</h2>
    <br>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Operations</th>
        </tr>

        <c:forEach var="user" items="${users}">
            <c:url var="updateButton" value="updateInfo">
                <c:param name="userId" value="${user.id}"/>
            </c:url>
            <c:url var="deleteButton" value="deleteUser">
                <c:param name="userId" value="${user.id}"/>
            </c:url>

            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>
                    <input type="button" value="Edit" onClick="window.location.href = '${updateButton}'"/>
                    <input type="button" value="Delete" onClick="window.location.href = '${deleteButton}'"/>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>

    <input type="button" value="Add" onclick="window.location.href ='add'"/>
</body>
</html>
