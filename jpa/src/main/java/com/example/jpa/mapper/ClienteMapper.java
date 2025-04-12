package com.example.jpa.mapper;

import com.example.jpa.model.dto.ClienteDTO;
import com.example.jpa.model.entity.Cliente;
import org.jetbrains.annotations.NotNull;

public class ClienteMapper {

    @NotNull
    public static ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setNombre(cliente.getNombre());
        dto.setEmail(cliente.getEmail());

        return dto;
    }

    public static Cliente toEntity(@NotNull ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNombre(dto.getNombre());
        cliente.setEmail(dto.getEmail());
        // Si deseas mapear las cuentas, puedes hacerlo aquí
        // cliente.setCuentas(CuentaMapper.toEntityList(dto.getCuentas()));
        return cliente;
    }
}