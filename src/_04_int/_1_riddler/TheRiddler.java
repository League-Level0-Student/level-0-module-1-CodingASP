package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Riddle1 = JOptionPane.showInputDialog("What can you catch but not throw?");
		if (Riddle1.equalsIgnoreCase("a cold")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
			
		}
	
		else {
			JOptionPane.showMessageDialog(null, "Wrong...");
			JOptionPane.showMessageDialog(null, "The answer is a cold.");
		}
	
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String Riddle2 = JOptionPane.showInputDialog("What is at the end of the rainbow?");
if (Riddle2.equalsIgnoreCase("The letter w")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong...");
	JOptionPane.showMessageDialog(null, "The answer is the letter w.");
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null,"You're score is " + score);
	}
}
