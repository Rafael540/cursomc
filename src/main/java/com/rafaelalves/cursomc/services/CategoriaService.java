package com.rafaelalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelalves.cursomc.domain.Categoria;
import com.rafaelalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	public Optional<Categoria> buscar(Integer id) {
		return repo.findById(id) ;
	}
	
}
