<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="/WEB-INF/views/common/sideSample.jsp"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
fieldset#ss {
	width: 600px;
	position: relative;
	left: 450px;
}
form fieldset {
	width: 600px;	
}
form.sform {
	background: lightgray;
	width: 630px;
	position: relative;
	left: 400px;
	display: none;  /* 안 보이게 함 */
}
</style>
</head>
<body>
<br>
<h1 align="center">공지사항 게시판</h1>

<div align="center">
    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
        </tr>
        <c:forEach var="notice" items="${notices}">
            <tr>
                <td>${notice.id}</td>
                <td>${notice.title}</td>
                <td>${notice.author}</td>
                <td><fmt:formatDate value="${notice.createdDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>