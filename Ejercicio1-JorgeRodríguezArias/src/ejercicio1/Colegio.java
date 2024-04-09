package ejercicio1;

import java.util.ArrayList;
import java.util.List;



/**
 * Clase colegio para crear un elemento colegio
 */
public class Colegio {
    
    private  ArrayList<Asignatura> asignaturas;
    private  List<Persona> persona;
    
    /**
     * Constructor unico de la clase colegio
     */
    
    public Colegio() {
    
    
}



/**
 * Metodo para guardar los datos en un fichero
 * No recibe ni devuelve devuelve nada
 */
public void guardarDatos() {

}

/**
 * Metodo para cargar los datos desde el fichero
 * No recibe ni devuelve nada
 */
public void cargarDatos() {
}

/**
 * Metodo que lista los proferores
 * no devuelve nada
 */
public void listarProfesores() {
        
}
        
    
/**
 * Metodo que lista los alumnos
 * no recibe ni devuelve nada
 */

public void listarAlumnos() {
        
    }

/**
 * Metodo que sirve para dar de alta un profesor segun el dni, nombre y departamento
 * @param dni String que representa el dni del profesor
 * @param nombre String que representa el nombre del profesor
 * @param departamento String que representa el departamento al que pertenece
 */

public void altaProfesor(String dni, String nombre, String departamento) {
        
    }

/**
 * Metodo que sirve para dar de alta un alumno segun el dni, nombre y nacionalidad
 * que recibe
 * @param dni String que representa el dni del alumno
 * @param nombre String que representa el nombre del alumno
 * @param nacionalidad String que representa la nacionalidad al que pertenece
 */

public void altaAlumno(String dni, String nombre, String nacionalidad) {
        
    }
/**
 * Metodo que permite dar de alta una asignatura segun los parametros recibidos
 * @param codigo String que representa el codigo de la asignatura
 * @param nombre String que representa el nombre de la asignatura
 * @param horas int que indica el numero de horas de la asignatura
 * @param dniProfesor String que representa el dni del profesor
 */
public void altaAsignatura(String codigo, String nombre, int horas, String dniProfesor) {
}
/**
 * Metodo para matricular un alumno segun la asignatura y el dni del mismo
 * no devuelve nada
 * @param codigoAsignatura String que indica el codigo de la asignatura
 * @param dniAlumno String que representa el dni del alumno
 */
public void matricularAlumno(String codigoAsignatura, String dniAlumno) {
}
/**
 * Metodo que indica las asignautras impartidas por un profesor
 * segun el dni que recibe
 * @param dni String que representa el dni del profesor
 * @return devuelve el int con la cantidad de asignaturas que imparte
 */
public int asignaturasDeUnProfesor(String dni) {
return 0;
}
/**
 * Metodo que indica la asignatura con mas alumnos matriculados
 * @return devuelve la asignatura con mas alumnos matriculados
 * correspondiente.
 */

public Asignatura asignaturasConmasalumnos() {

       return null;
}
}












