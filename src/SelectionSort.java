
public class SelectionSort {
SelectionSort(int A[],int n)
{
	int i,j,min,temp;
	for(i=0;i<n;i++)
	{
		min=i;
		for (j=i+1;j<n;j++)
		{
			if(A[j]<A[min])
				min=j;
		}
		temp=A[min];
		A[min]=A[i];
		A[i]=temp;
	}
}
}
