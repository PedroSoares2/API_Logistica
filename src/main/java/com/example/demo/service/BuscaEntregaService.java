package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.EntidadeNaoEncontradaException;
import com.example.demo.model.Entrega;
import com.example.demo.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(()-> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}
