package PanelBolita;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Programa03 extends JFrame {
    PanelBolita panelBolita;
    JLabel labelCoordenadas;
    JLabel ganaste;

    public Programa03() {
        setTitle("Bolita 01");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ganaste = new JLabel("No");
        labelCoordenadas = new JLabel("x=100 y=100");
        panelBolita = new PanelBolita(labelCoordenadas, ganaste);

        System.out.println("x=" + panelBolita.x);

        add(labelCoordenadas, BorderLayout.NORTH);
        add(panelBolita, BorderLayout.CENTER);
        add(ganaste, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Programa03 p = new Programa03();
        p.setVisible(true);
    }
}
