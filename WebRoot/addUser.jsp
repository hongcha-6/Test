<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <title>addUser.html</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <form name="f1" id="f1" action="user/add" method="post">
      <table>
        <tr>
          <td>姓名:</td>
          <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
          <td>年龄:</td>
          <td><input type="text" name="age" id="age"></td>
        </tr> 
        <tr>
          <td colspan="2"><input type="submit"></td>
        </tr>
      </table>
    </form>
  </body>
</html>
