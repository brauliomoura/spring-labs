package br.com.impacta.labs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/despesas")
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "pagina-inicial-despesas";
	}
	
	@RequestMapping("/exibeCategoria")
	public String exibirCategoria(@RequestParam String categoria, Model model) {
		String resultado = "Categoria informada : " + categoria.toUpperCase();
		model.addAttribute("mensagem", resultado);
		
		return "exibe-categoria";
	}

}
