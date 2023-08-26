package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Erika Camargo
 */

class SierpinskiPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private int iterations = 0;

    public SierpinskiPanel() {
        String enterText = JOptionPane.showInputDialog("Ingrese el número de iteraciones:");
        try {
            iterations = Integer.parseInt(enterText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se utilizará 0 como valor predeterminado.");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSierpinski(g, iterations, getWidth() / 2, 50, getWidth(), getHeight() - 100);
    }
    private void drawSierpinski(Graphics g, int depth, int x, int y, int width, int height) {
        if (depth == 0) {
            int[] xPoints = {x, x + width / 2, x - width / 2};
            int[] yPoints = {y, y + height, y + height};
            g.setColor(Color.BLACK);
            g.fillPolygon(xPoints, yPoints, 3);
        } else {
            int halfWidth = width / 2;
            int halfHeight = height / 2;
            drawSierpinski(g, depth - 1, x, y, halfWidth, halfHeight);
            drawSierpinski(g, depth - 1, x - halfWidth / 2, y + halfHeight, halfWidth, halfHeight);
            drawSierpinski(g, depth - 1, x + halfWidth / 2, y + halfHeight, halfWidth, halfHeight);
        }
    }
}