import java.util.Scanner;
public class para {
	public static void main(String[] args) {
		
		int num1,num2,sum;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		num1=s.nextInt();
		
		System.out.println("Enter Second Number: ");
		num2=s.nextInt();

		sum=num1 + num2;
		System.out.println("Sum of these number: "+sum);
	}
}	
