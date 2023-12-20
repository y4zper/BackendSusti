package com.sustiDAWII.sustiDAWII.controller;

import com.sustiDAWII.sustiDAWII.model.bd.Docente;
import com.sustiDAWII.sustiDAWII.model.request.DocenteRequest;
import com.sustiDAWII.sustiDAWII.repository.DocenteRepository;
import com.sustiDAWII.sustiDAWII.service.DocenteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/docente")
@CrossOrigin(origins="http://localhost:4200/")
public class DocenteController {
    private DocenteService docenteService;

    @GetMapping("")
    public ResponseEntity<List<Docente>> listarDocentes(){
        List<Docente> docenteList = new ArrayList<>();
        docenteService.listarDocentes().forEach(docenteList::add);
        if(docenteList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(docenteList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Docente> actualizardocente(@RequestBody DocenteRequest docenteRequest) {
        Docente docenteGuardado = docenteService.guardarDocente(docenteRequest);
        return new ResponseEntity<>(docenteGuardado, HttpStatus.CREATED);
    }


    @DeleteMapping("/{iddocente}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Integer iddocente) {
        docenteService.eliminarDocente(iddocente);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}