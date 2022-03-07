package ArraysDemo;

public class ArraySum {

	public static void main(String[] args) {
	
		int[] marks= {3,5,3,6,7,4,8};
	    int length= marks.length;
		int sum=0;
		
		for(int i=0;i<length;i++)
		{
			sum=marks[i]+sum;
		}
		
		System.out.println(sum);
		
	}
	
}
