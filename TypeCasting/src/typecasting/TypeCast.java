package typecasting;
import java.util.Scanner;
public class TypeCast {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a integer value : ");
		int number=sc.nextInt();
		
		double db=number;
		System.out.println("integer value after implicit typecasting = "+db);
		
		char ch= (char)number;
		System.out.println("integer value after explicit typecasting = "+ch);
				
		sc.close();
		
		
	}

}
