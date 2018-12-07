import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
	
		int sum = 0;
		
		System.out.println("Hello. Please enter an integer.");
		
		Scanner sc = new Scanner(System.in);

		Double inputNumber = sc.nextDouble();
		
		String inputNumberString = inputNumber.toString();
		
		while(inputNumber < 1 || !isStringInteger(inputNumberString)) {
			System.out.println("Please enter a POSITIVE INTEGER!");
			inputNumber = sc.nextDouble();
		}
		
		for(int i = 1 ; i < inputNumber + 1 ; i ++) {
			
			sum += i;
			
			System.out.println(sum);
		}
		
		sc.close();
		
	}
	
	public static boolean isStringInteger(String number ){
	    try{
	        Integer.parseInt(number);
	    }catch(Exception e ){
	        return false;
	    }
	    return true;
	}

}
