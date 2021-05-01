<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="nompre" class="modele.authentificationB" scope="session"></jsp:useBean>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="authentificationH.html" method="post">
 <font color="blue"><p> <h3>${ message }</h3></p></font>

<p> 
<jsp:setProperty property="nom" name="nompre"/>
<jsp:setProperty property="prenom" name="nompre"/>
<p>
<h4>Prenom :<font color="red"> <%= request.getAttribute("prenom") %></font></h4>
<h4>Nom :<font color="red"> <%= request.getAttribute("nom") %></font></h4> <br>
</body>
</html>