package PanelBolita;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBolita extends JPanel implements MouseMotionListener {
    int x = 100;
    int y = 100;
    JLabel labelCoordenadas;
    JLabel ganasteX;

    public PanelBolita(JLabel labelCoordenadas, JLabel ganasteX) {
        this.labelCoordenadas = labelCoordenadas;
        this.ganasteX = ganasteX;
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        labelCoordenadas.setText("x=" + x + " y=" + y);

        if (x == 150 && y == 150) {
            ganasteX.setText("Ganaste");
        } else {
            ganasteX.setText("No");
        }

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // puedes agregar lógica aquí si quieres
    }
}
