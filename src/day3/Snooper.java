package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String SS = JOptionPane.showInputDialog("What is your Social Security Number?");
		String age = JOptionPane.showInputDialog("What is your age?");
		String CCN = JOptionPane.showInputDialog("What is your Credit Card number?");
		System.out.println("Name: " + name + ", Age:" + age + ", Social Security Number: " + SS + ", Credit Card number: " + CCN);




		
	}
}
