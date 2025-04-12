package com.example.jpa.service;

import com.example.jpa.exception.NotFoundException;
import com.example.jpa.mapper.ClienteMapper;
import com.example.jpa.model.dto.ClienteDTO;
import com.example.jpa.model.entity.Cliente;
import com.example.jpa.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO crear(ClienteDTO dto) {
        Cliente cliente = ClienteMapper.toEntity(dto);
        return ClienteMapper.toDTO(clienteRepository.save(cliente));
    }

    public ClienteDTO obtenerPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Cliente no encontrado"));
        return ClienteMapper.toDTO(cliente);
    }

    public List<ClienteDTO> listar() {
        return clienteRepository.findAll()
                .stream().map(ClienteMapper::toDTO).collect(Collectors.toList());
    }

    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}