<%--
  Created by IntelliJ IDEA.
  User: 刘晓杰
  Date: 2023/5/10
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<table id="products" border="1" width="60%">
    <tr align="center">
        <td>你好：
            ${NAME}
            本次你的期末成绩如下表</td>
        <td><input type="submit" value="退出" onclick="turn()"></td>
    </tr>
    <tr align="center">
        <td colspan="2" align="center">
            <input type="button" value="学生信息"
                   >
        </td>
    </tr>
    <tr align="center">
        <td>科目</td>
        <td>分数</td>
    </tr>
    <tr>
        <td>语文</td>
        <td>98</td>
    </tr>
    <tr>
        <td>数学</td>
        <td>99</td>
    </tr>
</table>
<script type="text/javascript">
    function turn() {
        window.location.href='login.jsp';
    }
</script>
</body>
</html>
