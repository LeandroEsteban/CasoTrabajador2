package GUI;

import Modelo.Trabajador;

import javax.swing.*;
import java.awt.*;

public class VentanaTrabajador extends JFrame implements InterfazGUI {
    private Trabajador trabajador;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoRut;
    private JTextField campoIsapre;
    private JTextField campoAFP;

    public VentanaTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nombre:"));
        campoNombre = new JTextField(trabajador.getNombre());
        add(campoNombre);

        add(new JLabel("Apellido:"));
        campoApellido = new JTextField(trabajador.getApellido());
        add(campoApellido);

        add(new JLabel("RUT:"));
        campoRut = new JTextField(trabajador.getRut());
        add(campoRut);

        add(new JLabel("Isapre:"));
        campoIsapre = new JTextField(trabajador.getIsapre());
        add(campoIsapre);

        add(new JLabel("AFP:"));
        campoAFP = new JTextField(trabajador.getAFP());
        add(campoAFP);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actualizarTrabajador() {
        trabajador.setNombre(campoNombre.getText());
        trabajador.setApellido(campoApellido.getText());
        trabajador.setRut(campoRut.getText());
        trabajador.setIsapre(campoIsapre.getText());
        trabajador.setAFP(campoAFP.getText());
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }

    @Override
    public void ocultar() {
        setVisible(false);
    }
}
