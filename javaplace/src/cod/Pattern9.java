package cod;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr value of n");
		int n=sc.nextInt();
		int i,j,sp,k=1;
		for(i=1;i<=n;i++)
		{
			for(sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=k;j++)
			{
				System.out.print("*");
				
			}
		
			System.out.println();
			k=k+2;
		}
		int s=0;
		int t=2*n-1;
		for(i=n;i>=1;i--)
		{
			for(sp=1;sp<=s;sp++)
			{
				System.out.print(" ");
			
				
			}
			s++;
			
			for(j=1;j<=t;j++) 
			{
				System.out.print("*");
				
			}
			t=t-2;
			System.out.println();
		}
		
		
        
		
	}

}
