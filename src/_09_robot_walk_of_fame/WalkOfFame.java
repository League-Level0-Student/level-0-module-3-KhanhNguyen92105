
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(400);
		// You also need to show the robot to see the result of this line.
rob.penDown();
rob.setSpeed(100);
		// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);
rob.turn(144);
rob.move(144);


		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
