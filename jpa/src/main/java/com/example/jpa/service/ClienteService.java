package com.example.jpa.service;

import com.example.jpa.model.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    ClienteDTO crear(ClienteDTO dto);
    ClienteDTO obtenerPorId(Long id);
    List<ClienteDTO> listar();
    void eliminar(Long id);
}