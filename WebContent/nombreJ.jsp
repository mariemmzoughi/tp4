<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="nombre" class="modele.nombreB" scope="session"></jsp:useBean>
<%! String titre=" nombre " ; %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="nombreH.html" method="post">
<p>
<h3>le nombre aleatoire est <%= request.getAttribute("randomNum") %></h3><br>
</body>
</html>