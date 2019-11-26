package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollerCosting {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How tall are you in inches?");
		
		int inches = Integer.parseInt(input);
		
		if(inches < 48) {
			JOptionPane.showMessageDialog(null, "Soory. You have to grow taller):");
		}
		else
		{
	 JOptionPane.showMessageDialog(null, "Have Fun!");
		}
		}
	}


