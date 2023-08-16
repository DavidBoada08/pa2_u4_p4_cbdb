package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.IPropietarioService;

@Controller
//anotacion adisional para controlar una peticion
//siempre en plural en nombre del mapping
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private IPropietarioService iPropietarioService;

	// el controller recibe la operacion y redirecciona a una vista
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {

		List<Propietario> lista = this.iPropietarioService.buscarTodos();
		modelo.addAttribute("propietarios", lista);
		return "vistaListaPropietarios";

	}
}
