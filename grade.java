import java.util.Scanner;

public class grade {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the score :");
		int s = sc.nextInt();
		
		if(s>=90)
			System.out.print("Grade : A\n");
			
		else if(s>=80)
			System.out.print("Grade : B\n");
			
		else if(s>=70)
			System.out.print("Grade : C\n");
			
		else if(s>=60)
			System.out.print("Grade : D\n");
			
		else if(s>=50)
			System.out.print("Grade : E\n");
			
		else 
			System.out.print("Failed\n");
	
	
	}

}
