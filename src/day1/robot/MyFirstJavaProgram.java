package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		

		Robot boomer = new Robot();
		int move = 100;
		boomer.setPenColor(255, 0, 0);
		boomer.setSpeed(1000);
		boomer.hide();
		boomer.penDown();
		for (int i1 = 0; i1 < 100; i1++) {
			for (int i = 0; i < 4; i++) {
				boomer.move(move);
				boomer.turn(90);
			}
				move = move - 1;
				
				
			}
		}
		
		
		
	}

