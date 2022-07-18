package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/entrada") 
public class MonitoramentoFilter implements Filter{
	
	public void init(FilterConfig filterConfig) throws ServletException{}
	
	@Override
	public void destroy() {};

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		long antes = System.currentTimeMillis();
		
		chain.doFilter(request, response); //se nao chama esse chain, fica parado, fecha a porta.
		String acao = request.getParameter("acao");
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo de execução da acao: " + acao + "->"+(antes - depois) );
	}

}
