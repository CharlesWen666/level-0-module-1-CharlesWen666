package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
	
	String Colby = "A great teacher";
	String Kaden = "Always want to learn a lot";
	String Chole = "Almost never talk";
	String Jerry = "Learn a lot in front than us";
	String Charles = "Super clever";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String Awnser = JOptionPane.showInputDialog("who are you?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(Awnser.equalsIgnoreCase("Colby")){
		JOptionPane.showMessageDialog(null, "you are"+Colby);
	}
	if(Awnser.equalsIgnoreCase("Kaden")){
		JOptionPane.showMessageDialog(null,"you are"+ Kaden);
	}
	if(Awnser.equalsIgnoreCase("Chole")){
		JOptionPane.showMessageDialog(null,"you are"+ Chole);
	}
	if(Awnser.equalsIgnoreCase("Jerry")){
		JOptionPane.showMessageDialog(null,"you are"+ Jerry);
		
		if(Awnser.equalsIgnoreCase("Charles")){
			JOptionPane.showMessageDialog(null, "you are"+Charles);
		
		}
	}
}
}

