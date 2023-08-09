package com.example.cadenas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		return "¡El Dojo es increíble!";
	}
	
	@RequestMapping("/burbank-dojo{burbank-dojo}")
	public String burbank(@PathVariable("burbank-dojo") String burbankdojo) {
		return "El Dojo Burbank está localizado al sur de California";
	}
	
	@RequestMapping("/san-jose{san-jose}")
	public String sanJose(@PathVariable("san-jose") String sanjose) {
		return "El Dojo SJ es el cuartel general"+sanjose;
	}
}
