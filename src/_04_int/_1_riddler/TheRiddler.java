package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "Lets do two riddles");
		String a =  JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it. \r\n" + 
				"Who uses it can neither see nor feel it. \r\n" + 
				"What is it?");
		if(a.equalsIgnoreCase("Coffin")||a.equalsIgnoreCase("Coffins")||a.equalsIgnoreCase("a Coffin")) {
			JOptionPane.showMessageDialog(null,"correct!");
			score++;
		}
		else{
		JOptionPane.showMessageDialog(null, "Wrong");
		JOptionPane.showMessageDialog(null, "The Awnser is coffin!");
		}
		
		String b =  JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if(b.equalsIgnoreCase("Stamp")||b.equalsIgnoreCase("a Stamp")||b.equalsIgnoreCase("Stamps")) {
			JOptionPane.showMessageDialog(null,"correct!");
			score++;
		}
		else{
		JOptionPane.showMessageDialog(null, "Wrong");
		JOptionPane.showMessageDialog(null, "The Awnser is a Stamp ");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is:"+score);
	}
}

