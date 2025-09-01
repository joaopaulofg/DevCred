package com.joaopaulofg.propostacreditoapp.entity;

import jakarta.persistence.*;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovada;

    private boolean integrada;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
