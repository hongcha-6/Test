<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>modifyUser.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <form name="f1" id="f1" action="modify" method="post">
    	<input type="hidden" name="id" value="${user.id }"/>
		<table>
			<tr>
				<td>名字:</td>
				<td><input type="text" name="name" id="name" value="${user.name }">
				</td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type="text" name="age" id="age" value="${user.age }">
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
  </body>
</html>
