import java.util.Scanner;
public class FindEvennum1to100 {
	public static void main(String[] args) {
        int a=0;		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
		     a=a+i;		
			}
		}
		System.out.println("even numbers:"+a);
}                      
}