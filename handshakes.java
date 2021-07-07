import java.util.*;
class handshakes 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of people:");
		int noop = scan.nextInt();
		int n = noop-1;
		int hs=n*(n+1)/2;
		System.out.println("Total no of hand shakes:" +hs);
	}
}
