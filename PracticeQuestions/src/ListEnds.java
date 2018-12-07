
import java.util.ArrayList;

import java.util.Scanner;

public class ListEnds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ArrayList<Integer> newAry = new ArrayList<Integer>();
		
		System.out.println("How large would you like to make your array?");
		
		int arrayLength = sc.nextInt();
		
		for(int i = 1 ; i <= arrayLength ; i++){
		System.out.println("Please enter the " + i + "th term.");
		
		int num = sc.nextInt();
		
		ary.add(num);
		}
		
	    newAry.add(ary.get(0));
		newAry.add(ary.get(ary.size()-1));
		

		System.out.println(ary);
		System.out.println(newAry);
		
		sc.close();
		
	}

}
