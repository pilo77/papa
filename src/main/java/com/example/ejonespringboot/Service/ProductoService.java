package com.example.ejonespringboot.Service;

import com.example.ejonespringboot.Model.Persona;
import com.example.ejonespringboot.Model.Producto;
import com.example.ejonespringboot.Repository.PersonaRepository;
import com.example.ejonespringboot.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepo;

    public Producto crearProducto(Producto producto){

        return productoRepo.save(producto);
    }

    public void borrarProducto(Long id){

        productoRepo.deleteById(id);
    }

    public List<Producto> listarProductos(){

        return productoRepo.findAll();
    }

    public Producto buscarProductoId(Long id){

        return productoRepo.findById(id).orElse(null);
    }

    public void modificarProducto(Producto producto) {

        Optional<Producto> productoEncontrado =
                productoRepo.findById(producto.getId());

        if (productoEncontrado.isPresent()) {

            Producto productoActualizado = productoEncontrado.get();
            productoActualizado.setNombre(producto.getNombre());
            productoActualizado.setPrecio(producto.getPrecio());
            productoActualizado.setPosition(producto.getPosition());

        }else {
            throw new NoSuchElementException("No se encontró el producto con ID " + producto.getId());
        }
    }
}
