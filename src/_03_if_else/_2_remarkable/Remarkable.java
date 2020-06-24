package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String remarkableOne = "you are smart.";
		String remarkableTwo = "you are cool.";
		String remarkableThree = "you like pie.";
		String response;
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is your name?");
		if (name.contentEquals("Mike")) {
			response  = remarkableThree;
		}
		else if(name.equals("Isaac")) {
			response = remarkableOne;
		}
		else {
			response = remarkableTwo;
		}
		JOptionPane.showMessageDialog(null, "Okay, " + name + ", " + response);
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

