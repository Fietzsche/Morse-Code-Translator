package mct;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Window extends JFrame {
	public Window() {
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
