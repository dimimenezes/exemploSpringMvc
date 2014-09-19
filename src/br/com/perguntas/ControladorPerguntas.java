package br.com.perguntas;

import br.com.perguntas.DAO.PerguntaDAO;
import br.com.perguntas.constantes.Constantes;

public class ControladorPerguntas {

	private static ControladorPerguntas instancia;

	private ControladorPerguntas() {

	}

	public static synchronized ControladorPerguntas getInstance() {
		if (instancia == null) {

			instancia = new ControladorPerguntas();
		}
		return instancia;
	}

	public Assunto carregaPerguntas(Assunto assunto) {

		Pergunta p = new Pergunta();
		
		if (assunto.getIdAssunto() == Constantes.MATEMATICA) {
			assunto.setAssunto("Matematica");
			p.setPerguntaTem("2+2");
		} else if (assunto.getIdAssunto() == Constantes.PORTUGUES) {
			assunto.setAssunto("Portugues");
			p.setPerguntaTem("Verifique a frase incorreta");
			
		} else if (assunto.getIdAssunto() == Constantes.HISTORIA) {
			assunto.setAssunto("História");
			
			p.setPerguntaTem("Quem descobriu a america");
		
		} else {

			assunto.setAssunto("Geografia");
			p.setPerguntaTem("Capital do Brasil");
		}

		PerguntaDAO perguntaDAO = new PerguntaDAO();
		perguntaDAO.carregarPergunta(assunto.getIdAssunto());

		
		
		
		assunto.setPergunta(p);
		
		return assunto;
		
	}

}
