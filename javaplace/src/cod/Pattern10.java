package cod;

import java.util.Scanner;

public class Pattern10 {

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
				if(i==1||i==2)
				{
					System.out.print("* ");
					
				}
				else
				{
					if(j==1||j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}
		for(i=n;i>=1;i--)
		{
			for(sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(j==1||j==i)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
