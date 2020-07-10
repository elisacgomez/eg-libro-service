package com.formacion.springboot.app.libro.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formacion.springboot.app.common.models.entity.Libro;


public interface LibroDao  extends JpaRepository<Libro, Long>{

}
