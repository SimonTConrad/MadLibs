import java.util.Scanner;

public class MadLib 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a noun/name:  ");
		String name = name = keyboard.nextLine();
		System.out.print("Please enter a past tense verb:  ");
		String verb1 = verb1 = keyboard.nextLine();
		System.out.print("Please enter a place:  ");
		String place1 = place1 = keyboard.nextLine();
		System.out.print("Please enter an adjective:  ");
		String adjective1 = adjective1 = keyboard.nextLine();
		System.out.print("Please enter a past tense verb:  ");
		String verb2 = verb2 = keyboard.nextLine();
		System.out.print("Please enter the name of an American celebrity who was accused of being a communist during the red scare:  ");
		String communist = communist = keyboard.nextLine();
		System.out.print("Please enter the name of another place:  ");
		String place2 = place2 = keyboard.nextLine();
		System.out.print("Please enter another adjective:  ");
		String adjective2 = adjective2 = keyboard.nextLine();
		System.out.print("Please enter a noun:  ");
		String noun1 = noun1 = keyboard.nextLine();
		System.out.print("Please enter an idea:  ");
		String idea1 = idea1 = keyboard.nextLine();
		System.out.print("I had to write a code for " + name + ". It wasn't that hard but it still had me " + verb1 
		+ ". I traveled to the far away land of " + place1 + ". It was very " + adjective1 + " and I couldn't wait to see more of \n"
		+ place1 + ". I felt kinda " + verb2 + ". Then I met a cool person named " + communist + ", I sure hope they aren't actually a communist!\n"
		+ " We then walked down the street to " + place2 + ". Which was pretty" + adjective2 + ". Then some random thought popped into my head about \n" 
		+ noun1 + ". I thought some more about it and came up with the idea of " + idea1 + ". And that was pretty much my whole day.");
		
		
		
		 
		

	}

}
