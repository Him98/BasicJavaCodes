import java.util.*;

class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int i,j;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int temp,m=0;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}