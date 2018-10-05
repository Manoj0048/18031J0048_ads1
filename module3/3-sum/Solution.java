import java.util.Scanner;


public class Solution {
public static void main(String[] args)

{
	
	int count=0;

	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();

	int[] a=new int[n];

	while(sc.hasNext())

	{

		for(int i=0;i<n;i++)

		{

			a[i]=sc.nextInt();

		}

	}

	for(int i=0;i<n;i++)

	{

		for(int j=(i+1);j<n;j++)

		{

				for(int k=(j+1);k<n;k++)

				{
					
if(a[i]+a[j]+a[k]==0)

					{

						count++;

						break;

					}

				}

		}

	}

	System.out.println(count);

	
}

}
