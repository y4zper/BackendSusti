package com.sustiDAWII.sustiDAWII.model.request;



import lombok.Data;

import java.util.Date;

@Data
public class DocenteRequest {

    private Integer iddocente;
    private String nombre;
    private String dni;
    private Date fechanacimiento;
    private Double sueldo;
    private String email;
    private String sexo;
    private Integer idcategoria;

}
