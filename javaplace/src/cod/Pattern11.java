package cod;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr value of n");
		int n=sc.nextInt();
		int i,j,k,sp;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		
		   for(k=n;k>=1;k--)
		   {
			 for(sp=1;sp<=n-k;sp++)
			   {
				System.out.print(" ");
			   }
		 
			   for(j=1;j<=k;j++)
			   {
				System.out.print("*");
			   }
		   }
		 System.out.println();
		}
		
	
		

	}

}
