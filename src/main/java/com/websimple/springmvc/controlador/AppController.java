package com.websimple.springmvc.controlador;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websimple.springmvc.modelo.Mensaje;

@RestController
public class AppController {

	/**
	 * Este método regresa texto de bienvenida.
	 */
	@RequestMapping("/")
	public String saludo() {
		return "Bienvenido este es un ejemplo REST muy simple.";
	}
	
	/**
	 * Este método regresa un modelo Mensaje.
	 */
	@RequestMapping("/hola/{jugador}")
	public Mensaje mensaje(@PathVariable String jugador) {
		Mensaje msg = new Mensaje(jugador, "Hola " + jugador);
		return msg;
	}
}
