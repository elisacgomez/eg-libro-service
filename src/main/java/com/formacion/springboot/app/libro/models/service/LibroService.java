package com.formacion.springboot.app.libro.models.service;

import java.util.List;

import com.formacion.springboot.app.common.models.entity.Libro;

public interface LibroService {
	
	//Metodo para buscar todos los libros registrados
	public List<Libro> findAll();
	
	//Metodo para encontrar un libro segun el ID
	public Libro findById(Long id);
	
	//Metodo para almacenar un libro
	public Libro save(Libro libro);
	
	//Metodo para eliminar un libro por ID
	public void deleteById(Long id);
	
}
