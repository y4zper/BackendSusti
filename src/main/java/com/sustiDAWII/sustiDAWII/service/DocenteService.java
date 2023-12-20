package com.sustiDAWII.sustiDAWII.service;

import com.sustiDAWII.sustiDAWII.model.bd.Categoria;
import com.sustiDAWII.sustiDAWII.model.bd.Docente;
import com.sustiDAWII.sustiDAWII.model.request.DocenteRequest;
import com.sustiDAWII.sustiDAWII.repository.DocenteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@AllArgsConstructor

public class DocenteService {

    private DocenteRepository docenteRepository;

    public List<Docente> listarDocentes(){
        return  docenteRepository.findAll();
    }

    public Docente guardarDocente(DocenteRequest docente){
        Docente objDocente = new Docente();
        if(docente.getIddocente() > 0){
            objDocente.setIddocente(docente.getIddocente());
        }
        objDocente.setNombre(docente.getNombre());
        objDocente.setDni(docente.getDni());
        objDocente.setFechanacimiento(docente.getFechanacimiento());
        objDocente.setSueldo(docente.getSueldo());
        objDocente.setEmail(docente.getEmail());
        objDocente.setSexo(docente.getSexo());

        Categoria categoria = new Categoria();
        categoria.setIdcategoria(docente.getIdcategoria());

        objDocente.setCategoria(categoria);

        return docenteRepository.save(objDocente);
    }

    public void eliminarDocente(Integer iddocente){
        docenteRepository.deleteById(iddocente);
    }

}
