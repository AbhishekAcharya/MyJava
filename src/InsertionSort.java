
public class InsertionSort {
InsertionSort(int A[],int n) {
	int i,j,v;
	for(i=1;i<=n-1;i++)
{
	v=A[i];
	j=i;
	while(A[j-1]>v &&j>=1)
	{
		A[j]=A[j-1];
		j--;
	}
	A[j]=v;
}
}
}
