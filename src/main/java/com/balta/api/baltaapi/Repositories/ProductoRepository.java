package com.balta.api.baltaapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balta.api.baltaapi.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
