package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); 
		
		response.setContentType("text/html");
		
		//Coleta os dados inseridos no formulário
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
				
		if (senha != null && senha.length() >= 8) {
				response.sendRedirect("index.jsp");
		}else {
			PrintWriter out = response.getWriter();
			out.print("Existe algo errado! \n");
			out.print("A senha deve ter 8 ou mais caracteres");
		}
		
		JavaBeans tbl_cadastro = new JavaBeans();
		tbl_cadastro.setNome(nome);
		tbl_cadastro.setEmail(email);
		tbl_cadastro.setSenha(senha);
		
		DAO dao = new DAO();
		dao.inserirCadastro(tbl_cadastro);
	}

}
