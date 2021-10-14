//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	
	// 1. Make a main method that includes all the steps below

		// 2. Get the user to enter a question for the 8 ball to answer
		
	ImageIcon ball = new ImageIcon("src/_01_random/_5_magic_8_ball/8ball.jpg");
	
	JOptionPane.showInputDialog(null, "What shall you ask the magic 8 ball?", "Magic 8 Ball", 0, ball, null, null);
	
	Random ran = new Random();
	
	int output = ran.nextInt(4);
	
	if(output==0) {
		
	}
	if(output==1) {
		
	}
	if(output==2) {
		
	}
	if(output==3) {
		
	}
		// 3. Make a variable and initialize it to a random number.
		//     ** You will need to make a random object!
		//     Limit the random numbers to be between 0 and 3

		
		// 4. If the random number is 0

		// -- tell the user "Yes"

		// 5. If the random number is 1

		// -- tell the user "No"

		// 6. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 7. If the random number is 3

		// -- write your own answer

}
	
}
