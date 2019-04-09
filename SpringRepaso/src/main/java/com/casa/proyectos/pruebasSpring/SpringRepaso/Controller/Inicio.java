package com.casa.proyectos.pruebasSpring.SpringRepaso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.casa.proyectos.pruebasSpring.SpringRepaso.Modelo.Apuesta;

@Controller
public class Inicio {

	@Autowired
	private final CrudAble<Apuesta> repositorio = null;
	
	@GetMapping("/apuestas/")
	public String VerApuestas(Model modelo) {
		modelo.addAttribute("apuestas", repositorio.getAll());
		return "inicio";
	}
}
