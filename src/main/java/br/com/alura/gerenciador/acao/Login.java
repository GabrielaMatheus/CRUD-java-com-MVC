package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Action{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		
		

		Banco banco = new Banco();
		
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			System.out.println("usuario existe");
			HttpSession sessao = request.getSession(); //armazena a sessão do usuario - cookie
			sessao.setAttribute("usuarioLogado", usuario); //faz a requisição isoladamente
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			return "redirect:entrada?acao=LoginForm";
		}
		

	}
}
