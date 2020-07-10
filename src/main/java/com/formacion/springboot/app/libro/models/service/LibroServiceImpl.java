package com.formacion.springboot.app.libro.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.springboot.app.libro.models.dao.LibroDao;
import com.formacion.springboot.app.common.models.entity.Libro;


@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroDao libroDao;
	
	@Override
	@Transactional(readOnly = true )
	public List<Libro> findAll() {
		return libroDao.findAll();
	}

	@Override
	public Libro findById(Long id) {
		return libroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Libro save(Libro libro) {
		return libroDao.save(libro);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		libroDao.deleteById(id);
	}

}
