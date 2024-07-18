import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the height and width");
	    double a=in.nextDouble();
	    Double b=in.nextDouble();
	    System.out.println("perimeter of rectangle is:"+2*(a+b));

	}

}

