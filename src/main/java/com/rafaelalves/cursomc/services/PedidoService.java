package com.rafaelalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelalves.cursomc.domain.Pedido;
import com.rafaelalves.cursomc.repositories.PedidoRepository;
import com.rafaelalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	
	public Optional<Pedido> buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj;			
	}
	
}
