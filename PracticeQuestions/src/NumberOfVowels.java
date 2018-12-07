import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input some text!");
		
		String phrase = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0 ; i < phrase.length() ; i++) {
			char c = phrase.charAt(i);
			
			if(c == 'a' || c == 'b'
				|| c == 'c' || c == 'd' ||
				c == 'e') {
				count += 1;
			}
			else {}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
