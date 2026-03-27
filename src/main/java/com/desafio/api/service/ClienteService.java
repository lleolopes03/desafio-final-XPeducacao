package com.desafio.api.service;

import com.desafio.api.model.Cliente;
import com.desafio.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Cliente atualizar(Long id, Cliente dados) {
        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado: " + id));
        cliente.setNome(dados.getNome());
        cliente.setEmail(dados.getEmail());
        cliente.setTelefone(dados.getTelefone());
        return repository.save(cliente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public long contar() {
        return repository.count();
    }
}
