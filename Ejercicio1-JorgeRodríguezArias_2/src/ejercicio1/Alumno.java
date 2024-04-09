
package ejercicio1;

import java.time.LocalDate;

/**
 * Subclase alumno de la clase persona
 * @author manu_
 */

public class Alumno extends Persona {
    private LocalDate fechaMatriculacion;
    private String nacionalidad;
    
    /**
     * Constructor unico de la clase alumno, crea objeto alumno con el dni
     * nombre, fecha matriculacion y nacionalidad del alumno que recibe
     * @param dni String que representa el dni del alumno
     * @param nombre String que representa el nombre del alumno
     * @param fechaMatriculacion LocalDate que representa la fecha de matriculacion
     * @param nacionalidad String que representa la cacionalidad del alumno
     */

    public Alumno(String dni, String nombre, LocalDate fechaMatriculacion, String nacionalidad) {
        super(dni, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}