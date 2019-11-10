package hello1;

import java.util.Random;

import javax.swing.JOptionPane;

public class what {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = ran.nextInt(11);
		int num1 = ran.nextInt(11);
		int num2 = ran.nextInt(11);
		int num3 = ran.nextInt(11);
		int num4 = ran.nextInt(11);

		JOptionPane.showMessageDialog(null,num + " " + num1 + " " + num2 + " "+ num3+ " " + num4 );
	}

}
