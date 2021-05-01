<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="client1" class="modele.clientB" scope="session"></jsp:useBean>
<%! String titre=" " ; %>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="clientH.html" method="post">
 <font color="red"> <h3>     <p >${ message }</p></h3> </font>
<jsp:setProperty property="nom" name="client1"/>
<jsp:setProperty property="prenom" name="client1"/>
<jsp:setProperty property="adresse" name="client1"/>
<jsp:setProperty property="telephone" name="client1"/>
<jsp:setProperty property="email" name="client1"/>

<p>Nom :<font color="blue">                <%=  client1.getNom() %></font></p>
<p>Prénom : <font color="blue">            <%= client1.getPrenom() %></font></p>
<p>Adresse :<font color="blue">            <%=  client1.getAdresse() %></font></p>
<p>Numéro de téléphone :<font color="blue"><%=  client1.getTelephone() %></font> </p>
<p>Email :<font color="blue">              <%=  client1.getEmail() %></font> </p>
</body>
</html>