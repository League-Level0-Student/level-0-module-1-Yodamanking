package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What is the number 22's favorite article of clothing?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.contentEquals("tutu")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was tutu.");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog("What is full of holes but still holds water?");
		if(answer.contentEquals("sponge")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was tutu.");
		}
		// 2. Make a pop up to show the score.
		
	}
}

