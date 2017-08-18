package Weather;

import java.util.Scanner;

public class weather 
{



	public static void main(String[] args) 
	{
	System.out.print("What is your temperature in Ferinhite?");	
	
	Scanner cin = new Scanner(System.in);
	
	double c = 0;
	
	int f = cin.nextInt();
	
	{
		c=(5*((double)f-32)/9);
		System.out.println((double)c);
	}
	cin.close();
	
    }
	
}