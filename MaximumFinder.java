//Example taken from Java How to program by Paul Dietal 

import java.util.Scanner;

public class MaximumFinder
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double result = maximum(number1, number2, number3);
		System.out.println("Maximum is: "+result);
	}

	public static double maximum(double x, double y, double z)
	{
		double maxVal = x;
		if (y>maxVal)
			maxVal=y;
		if (z>maxVal)
			maxVal=z;
		return maxVal;
	}
}