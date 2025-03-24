package com.kayohimu.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
public class Compra {

    @Column(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

}
