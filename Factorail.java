import java.util.*;

public class Factorail{
	
	public static int factorail(int n) {
		if(n == 0) {
		return 1;}
		return n * factorail(n -1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println(" factorial is " + factorail(n));
		
	}
	
	
}