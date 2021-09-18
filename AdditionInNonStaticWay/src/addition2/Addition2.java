package addition2;
import java.util.Scanner;

public class Addition2 {

	public void add2() {
		
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
