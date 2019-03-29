package mct;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	public static JTextField englishText;
	public static JTextField morseText;
	public static JButton submit;
	
	public listener buttonListener;
	
	public int[] numArray;
	
	public File code;
	
	public String textFill; // Fills the opposing text field with the translation of the first
	
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
		
		textFill = "";
		
	}
	
	public class listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == submit) {
				textFill = "";
				numArray = new int[80];
				charToInt(englishText.getText());
				readMorseFile();
				morseText.setText(textFill);
			}
		}
	}
	
	public void charToInt(String s) {
		char c;
		for (short i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			numArray[i] += ((int) c - 96);
		}
		
		System.out.println(numArray[0]);
	}
	
	public void readMorseFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Codes.txt"));
			for (int j = 0; j < numArray[j]; j++) {
				textFill += reader.readLine().substring(2) + " ";
			}
			System.out.println(textFill);
		} catch(IOException e) {
			System.out.println("Codes.txt file not found");
		}
		
	}
}
