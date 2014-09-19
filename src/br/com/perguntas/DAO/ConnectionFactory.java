package br.com.perguntas.DAO;

public class ConnectionFactory {
	
	private static ConnectionFactory instancia;
	
	private ConnectionFactory(){
		
	}

	public static synchronized ConnectionFactory getInstance(){
		if (instancia == null){
			
			instancia = new ConnectionFactory();
		}
		return instancia;
	}
	
	
}
