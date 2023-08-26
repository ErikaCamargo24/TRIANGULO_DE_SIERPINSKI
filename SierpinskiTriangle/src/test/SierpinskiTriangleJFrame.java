package test;

import javax.swing.*;

/**
 * Erika Camargo
 */

public class SierpinskiTriangleJFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel sierpinskiPanel;

	public SierpinskiTriangleJFrame() {
		setTitle("Triángulo de Sierpinski");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		sierpinskiPanel = new SierpinskiPanel();
		add(sierpinskiPanel);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new SierpinskiTriangleJFrame());
	}

}

	   