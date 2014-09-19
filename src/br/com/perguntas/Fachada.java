package br.com.perguntas;

import br.com.perguntas.DAO.UsuarioDAO;

public class Fachada {
	

	public Assunto carregaPerguntas(Assunto assunto){
		
		return ControladorPerguntas.getInstance().carregaPerguntas(assunto);
		
		
	}
	
//	public void login(Usuario usuario){
//		
//	}
	


}
