import java.util.Scanner;

public class ElectrcityBill {

	public static void main(String[] args) {
		System.out.println("Enter the number of units : ");
		
		try(Scanner sc = new Scanner(System.in);){
		
		float unit = sc.nextFloat();
		
		if(unit<100)
			System.out.println("Bill is : "+(unit*1.2));
		
		else if(unit<=300)
			System.out.println("Bill is : "+(120+(unit-100)*2));
		
		else if(unit>300)
			System.out.println("Bill is : "+(520+(unit-300)*3));
	}
	}

}