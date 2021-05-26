package br.com.impacta.labs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.impacta.labs.model.Aluno;

@Controller
public class AlunoController {
	
	@RequestMapping("/aluno/form")
	public String exibeFormulario(Model model) {
		model.addAttribute("aluno", new Aluno());
		return "aluno-form";
	}
	
	@RequestMapping("/aluno/registraAluno")
	public String registra(@ModelAttribute Aluno aluno) {
		return "confirmacao-aluno";
	}
	

}
