
package ejercicio1;

/**
 * Clase Persona se usa para crear un elemento 
 * @author manu_
 */

public class Persona {
    private String dni;
    private String nombre;
    
    /**
     * Constructor unico de la clase persona
     * @param dni String que representa el dni de la persona
     * @param nombre String que representa el nombre de la persona
     */
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
    

