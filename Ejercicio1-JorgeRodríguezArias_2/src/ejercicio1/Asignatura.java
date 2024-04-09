
package ejercicio1;

import java.util.List;

/**
 * La clase asignatura se usa para crear un elemento de tipo asignatura
 * @author manu_
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private int horasAnuales;
    private Profesor profesor;
    private List<Alumno> alumnos;

    /**
     * Constructor unico de la clase asignatura, crea un objeto Asignatura
     * @param codigo String que indica codigo de asignatura
     * @param nombre String que indica el nombre de la asignatura
     * @param horasAnuales int que indica las horas anuales de la asignatura
     * @param profesor objeto de la clase profesor
     * @param alumnos lista de alumnos
     */
    public Asignatura(String codigo, String nombre, int horasAnuales, Profesor profesor, List<Alumno> alumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasAnuales = horasAnuales;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }
   /**
    * Getter que no recibe nada
    * @return devuelve el codigo de la asignatura
    */
    public String getCodigo() {
        return codigo;
    }
    
    /**
     * No devuelve nada
     * @param codigo String que representa el codigo de la asignatura
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Getter que no recibe nada
     * @return devuelve el nombre de la asignatura
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * No devuelve nada
     * @param nombre String que representa el nombre de la asignatura
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter que no recibe nada
     * @return Devuelve las horas anuales de la asignatura
     */
    public int getHorasAnuales() {
        return horasAnuales;
    }
    /**
     * No devuelve nada
     * @param horasAnuales int que indica las horas anuales de la asignatura
     */

    public void setHorasAnuales(int horasAnuales) {
        this.horasAnuales = horasAnuales;
    }
    /**
     * Getter que no recibe nada
     * @return Devuelve el objeto profesor de la asignatura
     */

    public Profesor getProfesor() {
        return profesor;
    }
    /**
     * No devuelve nada
     * @param profesor objeto profesor que indica el profesor de la asignatura
     */

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    /**
     * Getter que no recibe nada
     * @return devuelve una lista de alumnos de la asignatura
     */

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    /**
     * No devuelve nada
     * @param alumnos recibe lista de alumnos de la asignatura
     */

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}