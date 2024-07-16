import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	     Scanner  in= new Scanner(System.in);
	      int  l = in.nextInt();
	      System.out.println();
	     int a=1;
	     int b=1;
	     int f=0;
	     		 
	     for(int i=0;i<l;i++) {
	    	 System.out.print(a+"");
	    	f=a+b;
	    	a= b;
	    	b=f;
	    	
	     }
	}

}
