
/** The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium
*is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated
*by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. 
*Pass both to a method that calculates and returns the premium amount, and then display the returned amount. Save the application as Insurance.java.*/

//19.09.2022
//Denys Olaleye

import java.util.Scanner;

public class Insurance 
{
	public static void main (String [] args) 
	{
		int currentYear;
		int birthYear;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your year of birth >> ");
		birthYear = input.nextInt();
		System.out.print("Enter current year >> ");
		currentYear = input.nextInt();
		input.close();
		
		premiumAmount(currentYear, birthYear);
		
	}
	
	public static int premiumAmount(int curYear, int birthYear)
	{
		int premium;
		int decades;		
		
		decades = (curYear - birthYear)/10;
		premium = (decades + 15) * 20;
		
		System.out.println("Annual policy premium is equal to " +premium);		
		return premium;
	}
	
}
