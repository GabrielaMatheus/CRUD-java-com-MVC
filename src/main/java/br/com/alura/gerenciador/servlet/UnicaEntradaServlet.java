package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Action;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm")) ; //verifica se a page n�o � protegida
//		
//		if(acaoProtegida && usuarioNaoLogado) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return; //n�o executa abaixo se n�o estiver logado
//		}
//		
		
//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		String nome;
//		
//		try {
//			Class classe = Class.forName(nomeDaClasse); 
//			Action acao = (Action) classe.newInstance(); 
//			nome = acao.executa(request,response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e) {
//			throw new ServletException(e);
//		}
//		
//	
//		String[] tipoEEndereco = nome.split(":");
//		if(tipoEEndereco[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEEndereco[1]);
//			rd.forward(request, response);
//		}else {
//			response.sendRedirect(tipoEEndereco[1]);
//		}
		
	}
}
