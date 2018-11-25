<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/23
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/styles.css" rel="stylesheet" type="text/css">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>show.jsp......大家好 ss</h1>
    <table align="center" border="1" width="60%">
        <C:forEach items="${requestScope.list}" var="k" varStatus="st">
            <Tr align="center">
                <Td>${st.count}</Td>
                <Td>${k.name}</Td>
                <Td>${k.age}</Td>
            </Tr>
        </C:forEach>
    </table>
</body>
</html>
