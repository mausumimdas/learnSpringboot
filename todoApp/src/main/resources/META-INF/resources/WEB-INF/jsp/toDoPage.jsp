<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ToDo</title>
</head>
<body>
    <h1>Welcome ${name}</h1>
    <h2>Your todos are: </h2>

    <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>ToDo Name</th>
                    <th>TargetDate</th>
                    <th>IsCompleted</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${toDoDataByUserName}" var="todoItem">
                                    <tr>
                                        <td>${todoItem.ID}</td>
                                        <td>${todoItem.toDoName}</td>
                                        <td>${todoItem.targetDate}</td>
                                        <td>${todoItem.completed}</td>
                                    </tr>
                                </c:forEach>
            </tbody>
        </table>
</body>
</html>