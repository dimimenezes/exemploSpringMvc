package br.com.perguntas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import br.com.perguntas.Assunto;
import br.com.perguntas.Fachada;
import br.com.perguntas.constantes.Constantes;

@Controller
public class PerguntasController {

	@RequestMapping("/")
	public String execute() {
		return "assuntos";
	}

	@RequestMapping("/perguntas")
	public String carregarPerguntas(@RequestParam String assunto, Model model) {
		
		Assunto obj = new Assunto();
		obj.setIdAssunto(Integer.parseInt(assunto));

		Fachada f = new Fachada();

		f.carregaPerguntas(obj).getPergunta().getPerguntaTem();
		
		model.addAttribute("assunto", assunto);
		model.addAttribute("teste",obj.getPergunta());
		
		return "perguntas";
	}

	@RequestMapping("/confirmarRespostas")
	public String confirmarResposta(@RequestParam String radio, Model model) {

		if (radio.equalsIgnoreCase("2")) {

			System.out.println("Resposta Correta!!!!");
		}

		return "resultado";
	}
}
