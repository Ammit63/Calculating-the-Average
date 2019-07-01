import java.util.Scanner;
public class E10_CalcAverage {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// provide for user input
		System.out.println("Enter the first number: ");
		double fnum = input.nextDouble();
		System.out.println("Enter the second number: ");
		double snum = input.nextDouble();
		System.out.println("Enter the third number: ");
		double tnum = input.nextDouble();
		input.close();
		
		// Calculation
		double avg = (fnum + snum + tnum)/3;
		
		// to ensure rounding off process works you'll need to use printf instead of println and a ',' instead of '+' before the variable.
		System.out.printf("The average of the first number: "+ fnum + " together with the second number: "+ snum +" and then the third: "+ tnum +
				" will come out to be: %.1f" , avg);
		 
	}

}
