<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${articles.size() <= 0}">
		<p>게시물이 존재하지 않습니다.</p>
	</c:if>

	<c:if test="${articles.size() > 0}">

	<h2>게시글 목록</h2>
		<table border="1">
			<tr>
				<td>번호</td>
				<td>작성자</td>
				<td>제목</td>
				<td>비고</td>
			</tr>
			
			<%--컨트롤러가 가져온 게시글 데이터를 반복해서 출력하세요. --%>
			<%-- 게시글 갯수가 0개일 경우 목록대신 "게시글이 존재하지 않습니다" 출력. --%>		
			
			<c:forEach var="article" items="${articles}">
				<tr>
					<td>${article.boardNo}</td>
					<td>${article.writer}</td>
					<td>
						<a href="<c:url value='/board/content?boardNo=${article.boardNo}' />">${article.title}</a>
					</td>
					<td>
						<a href="<c:url value='/board/delete?boardNo=${article.boardNo}' />">[삭제]</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	
	</c:if>
	
	<a href="<c:url value='/board/write' />">게시글 작성하기</a>
	

</body>
</html>













