package br.com.perguntas;

import java.util.ArrayList;
import java.util.Map;

public class Pergunta {
	private int idPergunta;
	ArrayList<String> Pergunta;
	Map<Integer, ArrayList<String>> respostas;
	private String perguntaTem;
	
	public int getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
	}
	public ArrayList<String> getPergunta() {
		return Pergunta;
	}
	public void setPergunta(ArrayList<String> pergunta) {
		Pergunta = pergunta;
	}
	public Map<Integer, ArrayList<String>> getRespostas() {
		return respostas;
	}
	public void setRespostas(Map<Integer, ArrayList<String>> respostas) {
		this.respostas = respostas;
	}
	public String getPerguntaTem() {
		return perguntaTem;
	}
	public void setPerguntaTem(String perguntaTem) {
		this.perguntaTem = perguntaTem;
	}
}
