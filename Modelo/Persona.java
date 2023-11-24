package Modelo;

public class Persona implements InterfazDatos {
    protected String nombre;
    protected String apellido;
    protected String rut;

    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

}

