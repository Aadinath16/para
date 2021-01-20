import java.util.Scanner;
public class para {
	public static void main(String[] args) {
		
		int x,y,sum;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		x=s.nextInt();
		
		System.out.println("Enter Second Number: ");
		y=s.nextInt();

		sum=x + y;
		System.out.println("Sum of these number: "+sum);
	}
}	
