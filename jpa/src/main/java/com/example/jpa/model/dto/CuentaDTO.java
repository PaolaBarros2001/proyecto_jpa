package com.example.jpa.model.dto;

import java.util.List;

public class CuentaDTO {
    private Long id;
    private String numero;
    private Double saldo;
    private List<TransaccionDTO> transacciones;
    // Getters y setters
}