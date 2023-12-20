package com.sustiDAWII.sustiDAWII.repository;

import com.sustiDAWII.sustiDAWII.model.bd.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
