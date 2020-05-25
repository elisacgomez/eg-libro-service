package com.formacion.springboot.app.libro.models.service;

import java.util.List;

import com.formacion.springboot.app.libro.models.entity.Libro;

public interface LibroService {
	
	public List<Libro> findAll();
	public Libro findById(Long id);
}
