//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		String Color = JOptionPane.showInputDialog("what color do you want, red, green, or blue?");
		Robot  e = new Robot();
		e.setPenWidth(10);
		e.penDown();
		e.setSpeed(140);
		Random ran = new Random();
		int re = 0;
		int re1 = 0;
		int re2 = 0;
		re = ran.nextInt(44);
		re1 = ran.nextInt(255);
		re2 = ran.nextInt(255);
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set thea pen color that the user requested
		if(Color.equalsIgnoreCase("Blue")) {
			
			e.setPenColor(0, 0, 255);
			e.move(250);
			e.turn(90);
			e.move(250);
			e.turn(90);
			e.move(250);
			e.turn(90);
			e.move(250);
			}
			if(Color.equalsIgnoreCase("Red")) {
				e.setPenColor(255,0,0);
				e.move(250);
				e.turn(90);
				e.move(250);
				e.turn(90);
				e.move(250);
				e.turn(90);
				e.move(250);
				
			}
			     if(Color.equalsIgnoreCase("Green")) {
			    	 e.setPenColor(0, 255, 0);
			    	 e.move(250);
			    		e.turn(90);
			    		e.move(250);
			    		e.turn(90);
			    		e.move(250);
			    		e.turn(90);
						e.move(250);
			     }
			     
			     else {
			    	 if(Color.equalsIgnoreCase("Green")) {
			    		 e.penUp();
			    	 }
			    	 if(Color.equalsIgnoreCase("Red")) {
			    		 e.penUp();
			    	 }
			    	 if(Color.equalsIgnoreCase("Blue")) {
			    		 e.penUp();
			    	 }
			    	 e.setPenColor(re, re1, re2);
			    	
						e.move(250);
						e.turn(90);
						e.move(250);
						e.turn(90);
						e.move(250);
						e.turn(90);
						e.move(250);
			     }
   //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
