<%--
  Created by IntelliJ IDEA.
  User: 刘晓杰
  Date: 2023/5/10
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login" method="post">
<div>${error}</div>
    ${msg}
    <p>
        <label>姓名：</label><input type="text" name="username"  />
    </p>
    <p>
        <label>密码：</label><input type="password" name="password" />
    </p>

    <p>
        <input type="submit" name="" value="提交" >
    </p>
</form>
</body>
</html>
