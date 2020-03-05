
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String isaacNewtonsBirthday = "January 4th";
		String albertEinstein = "March 14";
		String myBirthday = "April 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Bday = JOptionPane.showInputDialog("which birth day do yo want?");
	
		// 3. Print out what the user typed
		System.out.print(Bday);
		// 4. if user asked for "mom"
		if(Bday.equalsIgnoreCase("Isaac Newton")) {
			JOptionPane.showMessageDialog(null, "January 4th");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(Bday.equalsIgnoreCase("Albert Einstein")) {
			JOptionPane.showMessageDialog(null, "March 14th");
		}
			// print dad's birthday
		// 6. if user asked for your name
		
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
