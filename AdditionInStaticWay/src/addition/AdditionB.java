package addition;
import java.util.Scanner;
public class AdditionB {
	
	public static void add() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number1 : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number2 : ");
		int num2 = scan.nextInt();
		
		int addition=num1+num2;
		System.out.println("num1 +num2 : "+addition);

		scan.close();

	}
	

}
