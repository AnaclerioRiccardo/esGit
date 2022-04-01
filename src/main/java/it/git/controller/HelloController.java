package it.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String saluta() {
		return "ciao";
	}
	
	@GetMapping("/helloRiccardo")
	public String salutaRiccardo() {
		return "ciao riccardo!";
	}

}
