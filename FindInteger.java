package control_statements;

import java.util.Scanner;

public class FindInteger {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a<=100) {
			if(a>90) {
				System.out.println("good");
			}else if(a<75) {
				System.out.println("average");
			}else{
				System.out.println("poor");
			}
			
		}
		
	}

} 


