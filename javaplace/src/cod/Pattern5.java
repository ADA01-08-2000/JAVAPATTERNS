package cod;
import java.util.*;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr value of n");
		int n=sc.nextInt();
		int i,j,sp;
		for(i=1;i<=n;i++)
		{
			for(sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
