package com.example.pruebasCIVA.Models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="buses")
public class BusModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int nro_bus;

    @Column(name="placa", unique = true, nullable = false)
    private String placa;

    @CreationTimestamp
    @Column(updatable = false) // Prevents updates to creation timestamp
    private Date fechaCreacion;
    
    @Column
    private String caracteristicas;
    
    @ManyToOne
    @JoinColumn(name = "marca_bus_id")
    private MarcaBus marcaBus;
    
    @Column
    private Boolean estado;
}
