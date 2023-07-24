package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Entrega;

public interface EntregaRepository extends JpaRepository<Entrega, Long> {
	
}
