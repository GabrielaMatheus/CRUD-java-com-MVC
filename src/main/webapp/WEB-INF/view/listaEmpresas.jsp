

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"
	import="java.util.List,br.com.alura.gerenciador.modelo.Usuario"
	
	%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ele nao vai acessar um link, vai verificar no nosso projeto se tem alguma biblioteca com esse nome -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>

	Usuário logado : ${usuarioLogado.login}
	
	<br/>
	<br/>

	<c:if test="${not empty empresa }">
	 Empresa ${ empresa } cadastrada com sucesso!
	 </c:if>

	Lista de empresas :<br />

	<ul>
		<!-- vai percorrer lista de empresas usando como contador empresa -->
		<c:forEach items="${empresas}" var="empresa">

			<li>${empresa.nome} - 
			<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
			<a href="<c:url value="/entrada?acao=MostraEmpresa&id=${empresa.id} "/>"> Editar</a>
			<a href="<c:url value="/entrada?acao=RemoveEmpresa&id=${empresa.id} "/>"> Remover</a>
			</li>

		</c:forEach> 

	</ul>






		<%-- 		SEM O JSTL (EXPRESSION LANGUAGE)   

<%   List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
 				 for(Empresa empresa: lista){
<%-- 					 %> --%>
		<!-- 					 <li> -->
		<%-- 					 <%= empresa.getNome() %> </li> --%>

		<%-- 					 <% 	}  
<%-- 		%> --%>



</body>
</html>