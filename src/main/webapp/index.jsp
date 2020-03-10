<%--
  Created by IntelliJ IDEA.
  User: WLK
  Date: 2020/3/5
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h3>保存测试</h3>
<form action="account/save" method="post">
    <label>
        姓名：<input type="text" name="name"/>
    </label><br>
    <label>
        金额：<input type="text" name="money"/>
    </label><br>
    <label>
        <input type="submit" value="提交">
    </label>
</form>
</body>
</html>
