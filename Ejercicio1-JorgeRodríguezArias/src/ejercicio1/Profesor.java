
package ejercicio1;

/**
 * Sublase profesor de la clase persona
 * @author manu_
 */

public class Profesor extends Persona {
    private String departamento;
    
    /**
     * Constructor unico de la clase profesor. Crea un objeto profesor
     * con el dni nombre y departamento que recibe
     * @param dni String que representa el dni del profesor
     * @param nombre String que indica el nombre del profesor
     * @param departamento String que indica el departamento al que pertenece
     */

    public Profesor(String dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
