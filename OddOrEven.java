package control_statements;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		if(a%2==0) {
			System.out.println("Even number");
		}
		else if(a%2==1) {
			System.out.println("Odd dtnumber");
	}
		else {
			System
			.out.println("invalid");
		}

}
}
	