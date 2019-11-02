package powersOfTwo;
import java.util.Scanner;

public class CheckThePowerOfTwo {

	public static void main(String[] args) {
		// Scanner Object
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter number to check if it is in power of Two");
		int n = myObj.nextInt();
		myObj.close();
		int counter = 0;
		if (n<1) {
			System.out.println("Please enter positive number");
		}
		else
		{
			if(n % 2 != 0) {
				System.out.println("Number is odd so it is not a power of two");
			}
			else {
				while(n%2 == 0) {
					if (n/2 >=1)
					{
					counter = counter + 1;
					n = n/2;
					if (n%2 != 0 && n > 1) {
						System.out.println("Number is not the power of two");
					}
					else if (n == 1)
					{
						System.out.println("The number is " + counter + " power of 2");
					}
					} // end of outer if sta't
				} // end of else
			}
		
		}

	}

}
