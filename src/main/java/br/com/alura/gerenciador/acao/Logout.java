package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Action {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		// sessao.removeAttribute("usuarioLogado"); //objeto continua em memória
		sessao.invalidate(); //remove todos os objetos - inclusive o cookie
		
		return "redirect:entrada?acao=LoginForm";
	}

}
