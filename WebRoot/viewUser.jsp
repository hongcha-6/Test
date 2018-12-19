<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ICEfaces, Ajax for Java EE</title>
</head>
<body>
	<c:forEach items="${pageInfo.list}" var="user">
    	${user.id } ${user.name } ${user.age }
    	<a href="remove?id=${user.id}">删除</a>
    	<a href="befModify?id=${user.id}">修改</a><br>
    	
	</c:forEach>
	<p>
            当前第 ${pageInfo.pageNum} 页/总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</p>
        
        <a href="viewAll?pn=${pageInfo.nextPage}">下一页</a>
        <a href="viewAll?pn=${pageInfo.prePage}">上一页</a>
        <a href="viewAll?pn=${pageInfo.pages}">最后页</a>
</body>
</html>