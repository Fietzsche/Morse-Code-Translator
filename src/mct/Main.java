package mct;

import javax.swing.JTextField;

public class Main {
	
	public static JTextField englishText;
	public static JTextField morseText;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window mainWindow = new Window();
		mainWindow.setTitle("Morse Code Translator");
		
		englishText = new JTextField();
		englishText.setColumns(15);
		morseText = new JTextField();
		morseText.setColumns(15);
		
		mainWindow.add(englishText);
		mainWindow.add(morseText);
	}

}
