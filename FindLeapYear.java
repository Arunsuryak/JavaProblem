public class LeapYear {

	public static void main(String[] args) {
		
			Scanner in=new Scanner(System.in);
			System.out.println("enter the year");
			int year=in.nextInt();
			if(year/4==0 && year/100!=0){
				System.out.println("leap year");
		   }
			else {
				System.out.println("not leap year");
			}

	}

}
