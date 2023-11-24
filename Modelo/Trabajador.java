package Modelo;

public class Trabajador extends Persona {
    private String isapre;
    private String AFP;

    public Trabajador(String nombre, String apellido, String rut, String isapre, String AFP) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.AFP = AFP;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }
}
