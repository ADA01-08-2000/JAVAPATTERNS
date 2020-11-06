package cod;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr value of n");
		int n=sc.nextInt();
		int i,j,sp,k;
		for(i=1;i<=n;i++)
		{
			for(sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
				
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		

	}

}
