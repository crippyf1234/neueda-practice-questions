import java.util.Random;
import java.util.Scanner;

public class HigherorLower {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		int randomNum = randomNumber.nextInt(20) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I have thought of a number between 1 and 20. \nPlease guess till you get it!");
		
		int num = sc.nextInt();
		
		while(randomNum != num) {
			
			if(num > 20 || num < 1) {
				System.out.println("You have guessed outside the range!");
			}
			
			else if(randomNum < num) {
				System.out.println("The number I'm thinking of is lower than the one you guessed! Please guess again.");
			}
			
			else {
				System.out.println("The number I'm thinking of is higher than the one you guessed! Please guess again.");
			}
			
			System.out.println("Please guess again.");
			
			num = sc.nextInt();
			
		 }
		
		System.out.println("Congrats you have guessed the number!");
	}

}
