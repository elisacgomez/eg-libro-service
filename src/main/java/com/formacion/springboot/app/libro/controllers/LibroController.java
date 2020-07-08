package com.formacion.springboot.app.libro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping("/libros")
	@ResponseStatus(HttpStatus.CREATED)
	public Libro crearLibro(@RequestBody Libro libro) {
		return libroService.save(libro);
	}
	
	@PutMapping("/libros/{id}")
	@ResponseStatus(HttpStatus.CREATED)
		public Libro actualizarLibro(@RequestBody Libro libro, @PathVariable Long id) {
		Libro libroDB = libroService.findById(id);	
		libroDB.setEditorial(libro.getEditorial());
		libroDB.setValor(libro.getValor());
		return libroService.save(libroDB);
	}
	
	@DeleteMapping("/libros/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarLibro(@PathVariable Long id) {
		libroService.deleteById(id);
	}
	
}
