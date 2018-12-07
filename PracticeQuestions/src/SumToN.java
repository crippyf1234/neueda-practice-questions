import java.util.InputMismatchException;
import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
	
		int sum = 0;
		int inputNumber;
		System.out.println("Hello. Please enter a positive integer.");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			inputNumber = sc.nextInt();
			while(inputNumber < 1) {
				System.out.println("Please enter a POSITIVE INTEGER!");
				inputNumber = sc.nextInt();
			}
		}
		
		catch(InputMismatchException e){
			System.out.println("Please enter an INTEGER!");
			sc.next();
		}
		
	
		for(int i = 1 ; i < inputNumber + 1 ; i ++) {
			
			sum += i;
			
			System.out.println(sum);
		}
		
		sc.close();
		
	}
	
}
