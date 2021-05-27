package br.com.impacta.labs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/despesas")
public class HomeController {
	
	
	//@RequestMapping(method = RequestMethod.GET, path="/home")
	@GetMapping("/home")
	public String home() {
		return "pagina-inicial-despesas";
	}
	

	// http://localhost:8080/despesas/exemplo-redirect
	@RequestMapping("exemplo-redirect")
	public String redirect() {
		return "redirect:/despesas/exibeCategoria?categoria=categoriaRedirecionada";
	}
	
	@RequestMapping("/exibeCategoria")
	public String exibirCategoria(@RequestParam String categoria, Model model) {
		String resultado = "Categoria informada : " + categoria.toUpperCase();
		model.addAttribute("mensagem", resultado);
		
		return "exibe-categoria";
	}
	
	// http://localhost:8080/despesas/hello/101/lazer?param1=teste&param2=Fulano
	@RequestMapping("/hello/{id}/{categoria}")
	public String getDetalhes(@PathVariable int id, @PathVariable String categoria, 
													@RequestParam String param1, @RequestParam String param2) {
		
		System.out.println("Path Variable id = " + id);
		System.out.println("Path Variable categoria = " + categoria);
		System.out.println("RequestParam param1 = " + param1);
		System.out.println("RequestParam param2 = " + param2);
		
		
		return "pagina-inicial-despesas";
	}
	
	// http://localhost:8080/despesas/header-info
	@RequestMapping("/header-info")
	public String displayHeader(@RequestHeader("Accept-Encoding") String encoding) {
		
		System.out.println("Encoding = " + encoding);
		
		return "pagina-inicial-despesas";
	}
	
	// http://localhost:8080/despesas/cookie-info
	@RequestMapping("/cookie-info")
	public String displayCookie(@CookieValue("JSESSIONID") String cookie) {
		
		System.out.println("JSessionId = " + cookie);
		
		return "pagina-inicial-despesas";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
