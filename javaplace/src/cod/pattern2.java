package cod;
import java.util.*;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int i,j;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=columns;j++)
			{
				if((i==1||i==rows)||(j==1||j==columns))
				{
					System.out.print("*");
					
				}
				else
				{
					if(j!=1||j!=columns)
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		
		

	}

}
