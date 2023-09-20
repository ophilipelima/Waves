<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<link rel="stylesheet" href="css/login.css">

</head>

<body>

	<header>
        
 		<nav class="navbar bg-body-tertiary">
 		 	<div class="container">
   				 <a class="navbar-brand" href="#">
     				 <img src="imagens/logo.PNG" alt="logo-waves" width="220">
    			</a>
  		  </div>
	  </nav>
        
        <ul class="nav justify-content-end">
  
  <li class="nav-item">
     <a class="btn btn-primary" href="cadastro.html" role="button">Não tem uma conta?</a>
  </li>
  
</ul>
    </header>
    
    <main>
        <aside>
        
             <h2><span>Faça login no</span></h2>
            <h2>Waves</h2>
            <p>
                Prepare-se para uma experiência musical sem igual com o Waves, a chave para desbloquear um universo ilimitado de entretenimento sonoro. Imagine ter acesso instantâneo a milhões de músicas, podcasts e playlists, tudo na ponta dos seus dedos.
            </p>
           
           	<form action="index.jsp" method="post">
	 		<input type="text" placeholder="E-mail" name="gmail">
	  		<input type ="password" placeholder="Senha" name="senha">
	  		<input  id="submit" type="submit" value="enviar"> 
	  		</form>
        </aside>

        <picture>
        
            <img src="imagens/menino.png"  class="rounded float-right" id="menino-fone" alt="menino-escutando-musica">
            
        </picture>
    </main>
	
	  <%	
		 
	  	String gmail = request.getParameter("gmail");
	  	String senha = request.getParameter("senha");
	  	
	  %>
</body>
</html>