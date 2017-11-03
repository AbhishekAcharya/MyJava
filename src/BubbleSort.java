
public class BubbleSort {
@SuppressWarnings("unused")
public BubbleSort(int A[],int n)
{
	int swapped=1;
	for ( int pass=n-1;pass>=0;pass--)
	{
		swapped=0;
		for ( int i=0; i<=pass-1; i++)
		{
			if(A[i]>A[i+1])
			{
				int temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
				swapped=1;
			}
		}
	}
}
}
