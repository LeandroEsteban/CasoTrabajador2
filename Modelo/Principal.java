package Modelo;

public class Principal {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan", "Perez", "12345678-9", "Fonasa", "AFP Modelo");
        VentanaTrabajador ventana = new VentanaTrabajador(trabajador);
        ventana.mostrar();
    }
}
