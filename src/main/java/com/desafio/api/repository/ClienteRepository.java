package com.desafio.api.repository;

import com.desafio.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}
