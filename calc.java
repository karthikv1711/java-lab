import java.util.Scanner;

public class calc {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a :");
		float a = sc.nextFloat();
		
		System.out.print("Enter value of b :");
		float b = sc.nextFloat();
		
		System.out.print("Enter your choice : \n+.sum\n-.difference\n*.product\n/.division\n%.remainder\n");
		char c = sc.next().charAt(0);
		
		switch (c){
		
			case '+' : System.out.print("Sum = "+(a+b));
				   break;
				  
			case '-' : System.out.print("Sum = "+(a-b));
				   break;
				  
			case '*' : System.out.print("Sum = "+(a*b));
				   break;
			
			case '/' : System.out.print("Sum = "+(a/b));
				   break;
				   	   
			case '%' : System.out.print("Sum = "+(a%b));
				   break;
				   
			default : System.out.print("Invalid choice");
		
		
		
		
		}
	
	}
}
