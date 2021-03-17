package com.wesleysilva.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleysilva.demo.domain.client.Cliente;
import com.wesleysilva.demo.domain.instalacao.Instalacao;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

	public Optional<Instalacao> findByCodigo(String codigo);
	public List<Instalacao> findByCliente(Cliente cliente);
	
	
}
