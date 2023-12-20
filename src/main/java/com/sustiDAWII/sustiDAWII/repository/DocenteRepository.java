package com.sustiDAWII.sustiDAWII.repository;

import com.sustiDAWII.sustiDAWII.model.bd.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

}
