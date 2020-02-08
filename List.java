// Taken from Guide to Data Structures using Java By Takako Soma et al published by Springer Press
// This program is supposed to insert/delete/show integers into a List

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ch3Test 
{
	public static void main(String[] args)
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		char response;
		int number;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Do you wish to I=Insert, D=Delete, O=Output or S=Stop");
		response = scanner.next().charAt(0);
		while(response!='S'&&response!='s')
		{
			if(response=='I'||response=='i')
			{
				System.out.println("Enter a number to insert");
				number = scanner.nextInt();
				if(list.add(number))
					System.out.println("The number was inserted");
				else
					System.out.println("The number was not inserted");;										
			}
			else 
				if(response=='D' || response=='d')
				{
					System.out.println("Enter to Delete");
					number = scanner.nextInt();
					if(list.remove(number) != null)
						System.out.println("The number was deleted");
					else
						System.out.println("The number was not deleted");
				}
			else
				if(response=='O' || response =='o')
					Arrays.toString(list.toArray());
				else
					System.out.println("The command entered is not valid");
			System.out.println("");
			System.out.println("Do you wish to I=Insert, D=Delete, O=Output or S=Stop");
			response = scanner.next().charAt(0); 
		}
		System.out.println();
		System.out.println("End of Program");
		System.out.println();
	}
}