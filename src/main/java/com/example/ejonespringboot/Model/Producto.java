package com.example.ejonespringboot.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String nombre;
    private String position;
    private String precio;



    public Producto(Long id, String nombre, String position, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.position = position;
        this.precio = precio;
    }

    public Producto(){}
}
