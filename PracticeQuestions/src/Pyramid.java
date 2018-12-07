import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		String leftHandSpacing = "";
		String hashes = "#";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input the number of rows!");
		
		int rows = sc.nextInt();
		
		for(int i = 1 ; i <= rows ; i++) {
			int numberOfSpaces = rows - i ;
			int numberOfHashes = 2*i - 1 ;
			for(int j = 0 ; j < numberOfSpaces ; j++) {
				leftHandSpacing += " ";
			}
			for(int k = 0 ; k < numberOfHashes - 1 ; k++) {
				hashes += "#";
			}
			
			System.out.println(leftHandSpacing + hashes + leftHandSpacing);
			leftHandSpacing = "";
			hashes = "#";
			
		}
			
			
			sc.close();

		}
		
		
	}


