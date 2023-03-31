package com.example.ejonespringboot.Repository;

import com.example.ejonespringboot.Model.Persona;
import com.example.ejonespringboot.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository   extends JpaRepository<Producto,Long> {

}
