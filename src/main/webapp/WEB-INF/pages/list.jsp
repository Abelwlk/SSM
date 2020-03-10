<%--
  Created by IntelliJ IDEA.
  User: WLK
  Date: 2020/3/5
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h1>list</h1><br>
<c:forEach items="${all}" var="account">
    ${account.name}<br>
</c:forEach>
</body>
</html>
