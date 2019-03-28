package mct;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	public static JTextField englishText;
	public static JTextField morseText;
	public static JButton submit;
	
	public listener buttonListener;
	
	public Window() {
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		englishText = new JTextField();
		englishText.setColumns(15);
		morseText = new JTextField();
		morseText.setColumns(15);
		
		buttonListener = new listener();
		
		submit = new JButton("Submit");
		submit.addActionListener(buttonListener);
		
		add(englishText);
		add(morseText);
		add(submit);
		
	}
	
	public class listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == submit) {
				morseText.setText("test");
				System.out.println("test");
			}
		}
	}
}
