package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you?");
		int ageAsInt = Integer.parseInt(age);
		
		if(ageAsInt >= 18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}else {
			JOptionPane.showMessageDialog(null, "You aren't old enough to vote!");
		}
		
	}

}
