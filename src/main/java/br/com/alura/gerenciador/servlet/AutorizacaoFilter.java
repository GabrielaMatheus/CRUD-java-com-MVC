package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException{}
	
	@Override
	public void destroy() {};

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		
		
		//cast dizendo que esses parametros são httpServlets
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean acaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm")) ; //verifica se a page não é protegida
		
		if(acaoProtegida && usuarioNaoLogado) {
			response.sendRedirect("entrada?acao=LoginForm");
			return; //não executa abaixo se não estiver logado
		}
		
		
		chain.doFilter(request, response);
	}


}
