package ArraysDemo;

public class MultiDemo {
 
	public static void main(String[] args) {
		
		int marks[][]=new int[3][3];  //row=3. col=3. rows*col .3*3=9
		
		//int k=0;
		//marks[value][value]=10;
		
		marks[0][0]=1;
		marks[0][1]=2;
		marks[0][2]=3;
		
		marks[1][0]=4;
		marks[1][1]=5;
		marks[1][2]=6;
		
		marks[2][0]=7;
		marks[2][1]=8;
		marks[2][2]=9;
		
		
		for(int i=0;i<3;i++) {
		
			for(int j=0;j<3;j++) {
				
		
			
		System.out.println(marks[i][j]);		
		
			}
			
		}
	
	
	
	
	
	}
}

