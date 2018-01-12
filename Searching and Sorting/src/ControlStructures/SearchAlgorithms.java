package ControlStructures;

public class SearchAlgorithms {

	public static void main(String[] args)
	{
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(binSearch(test1, 3));
		System.out.println(linSearch(test1, 3));
		
		System.out.println(binSearch(test2, 23));
		System.out.println(linSearch(test2, 23));
		
		System.out.println(binSearch(test2, 25));
		System.out.println(linSearch(test2, 25));
		
		System.out.println(binSearch(test1, 10));
		System.out.println(linSearch(test1, 1));
		
		System.out.println(binSearch(test1, 1));
	}
	
	public static int binSearch(int[] x, int q)
	{
		int L = 0;
		int R = x.length;
		int m = x.length/2;
		
		while(L<=R)
		{
			if(q==x[m])
			{
				return m;
			}
			if(q<x[m])
			{
				R=m-1;
			}
			if(q>x[m])
			{
				L=m+1;
			}
			m = ((R-L)/2)+L;
		}
		return -1;
	}
	
	public static int linSearch(int[] x, int q)
	{
		for(int i = 0; i<x.length; i++)
		{
			if(q==x[i])
			{
				return i;
			}
		}
		return -1;
	}
}
