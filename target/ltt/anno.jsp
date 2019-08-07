<%--
  Created by IntelliJ IDEA.
  User: fengyuanyuan
  Date: 19-6-16
  Time: 下午10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>常用的注解</h3>
<a href="anno/testRequestParam?username = 哈哈">RequestParam</a>
<br>

<form action="anno/testRequestBody" method="post">
    用户姓名:<input type="text" name="username"><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
<a href="/anno/testPathVariable/10">testPathVariable</a>
<br>
<a href="/anno/testRequestHeader">RequestHeader</a>
<br>
</body>
</html>
