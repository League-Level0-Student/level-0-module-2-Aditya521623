//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(3);

		System.out.println(randomNumber);

	for( int i =0; i<10; i++) {
		int randomNumber2 = randomMaker.nextInt(3);
		
		if(randomNumber2 == 0) {
			JOptionPane.showMessageDialog(null, " what is up");
			}
		if (randomNumber2 == 1) {
			JOptionPane.showMessageDialog(null, "I like your red shirt.");
		}
		
		
		if (randomNumber2 == 2) {
			JOptionPane.showMessageDialog(null, " Shotaaaaaayyyy");
	}
	

		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
