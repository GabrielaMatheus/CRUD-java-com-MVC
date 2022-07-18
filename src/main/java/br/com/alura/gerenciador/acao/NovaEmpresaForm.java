package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresaForm implements Action{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//essa classe é só pra conseguir acessar o jsp de novo formulário, ja que adicionando-o
		//a pasta WEB-INF impede que acessemos os jsps diretamente.
		
		return "forward:formNovaEmpresa.jsp";
	}
}
