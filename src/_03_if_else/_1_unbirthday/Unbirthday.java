package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthDate = JOptionPane.showInputDialog("When is your birthday?");
		if (birthDate.equals("06/24")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}
}
