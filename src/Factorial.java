import java.util.Scanner;


public class Factorial {
	
	
	public static void main(String [] args){
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el numero del factorial");
		Integer entrada = scan.nextInt();
		
	   Integer factorial = 1 ;
		for(int i= 1; i<=entrada; i++){
			factorial =i * factorial;
		}
		System.out.println(factorial);
	}

}
