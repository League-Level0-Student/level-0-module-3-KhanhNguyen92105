package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Answer =JOptionPane.showInputDialog("Are You Happy?");
	if(Answer.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep Doing what you're doing");
	}
	if(Answer.equalsIgnoreCase("No")) {
		String A1 = JOptionPane.showInputDialog("Do you want to be happy?");
	if(A1.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something");
		
	}
	if(A1.equalsIgnoreCase("No")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	}
	
	}

}
