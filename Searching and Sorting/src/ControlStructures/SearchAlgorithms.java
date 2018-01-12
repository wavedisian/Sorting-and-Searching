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
}
