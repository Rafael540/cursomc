package com.rafaelalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelalves.cursomc.domain.ItemPedido;
import com.rafaelalves.cursomc.domain.ItemPedidoPK;

@Repository
public interface ItemPedidorepository extends JpaRepository<ItemPedido, ItemPedidoPK>{

}
