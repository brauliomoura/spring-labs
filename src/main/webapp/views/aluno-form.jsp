<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>

	<form:form action="/aluno/registraAluno" modelAttribute="aluno">
	Nome: <form:input path="nome" />
		<br>
		<br>
	Sobrenome: <form:input path="sobrenome" />
		<br>
		<br>
		<input type="submit" value="Registrar" />
	</form:form>

</body>
</html>