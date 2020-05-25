package com.formacion.springboot.app.libro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.libro.models.entity.Libro;
import com.formacion.springboot.app.libro.models.service.LibroService;

@RestController
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@GetMapping("/libros")
	public List<Libro> obtenerLibros(){
		return libroService.findAll();
		
	}
	
	@GetMapping("/libros/{id}")
	public Libro obtenerLibro(@PathVariable Long id){
		return libroService.findById(id);
		
	}
}
