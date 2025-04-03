package com.example.pruebasCIVA.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "marca_bus")
public class MarcaBus {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column
    private String nombreMarca;

}
