<%--
  Created by IntelliJ IDEA.
  User: fengyuanyuan
  Date: 19-8-6
  Time: 下午9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
id:${requestScope.user.id}<br/>
email:${requestScope.user.email}<br/>
username:${requestScope.user.username}<br/>
role:${requestScope.user.role}<br/>
mobile:${requestScope.user.mobile}<br/>
</body>
</html>
