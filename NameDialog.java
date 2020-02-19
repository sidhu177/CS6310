// Taken from Java How to Program by Paul Dietel 
// This piece of code is to prompt user to enter name on a dialog box.

import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What's your name ?");
		String message = String.format("Welcome %s to the world", name);
		JOptionPane.showMessageDialog(null, message);
	}
}
