package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		// 1. Create a new Robot
		Robot boomer = new Robot();
		boomer.hide();
		// 5. Set your robot's pen to the down position
			boomer.penDown();
		// 3. Set the robot to go at max speed (10)
<<<<<<< HEAD
			boomer.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
			for (int i = 0; i < 75; i++) {
				// 7. Change the pen color to random
				boomer.setPenColor(0, 0, 0);
=======

		// 4. Do the following (steps 6-9) 75 times

			// 7. Change the pen color to random
	
>>>>>>> refs/remotes/jointheleague/master
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			boomer.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			boomer.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
			boomer.setPenWidth(i);
			// 9. Set the pen width to i
			// 1. Create a new Robot
			

			}
			Robot boomer2 = new Robot();
			boomer2.hide();
			// 5. Set your robot's pen to the down position
				boomer2.penDown();
			// 3. Set the robot to go at max speed (10)
				boomer2.setSpeed(10);
			// 4. Do the following (steps 7-9) 75 times
				for (int i2 = 0; i2 < 75; i2++) {
					// 7. Change the pen color to random
					boomer2.setRandomPenColor();
				// 6. Move the robot 5 times the current line number you are drawing (5*i)
				boomer2.move(5*i2);
				// 2. Turn the robot 1/3 of 360 degrees to the right
				boomer2.turn(360/7);
				// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
				boomer2.setPenWidth(i2);
				// 9. S
	}
}
}