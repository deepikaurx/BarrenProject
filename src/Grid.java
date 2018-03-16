import java.util.Arrays;
public class Grid {
	
	 public void gridx() {
		 int[][] multiArray = new int[10][10];
	
		
		for (int x = 0; x < multiArray.length; x++) 
		  {
		    System.out.println();
		    for(int y=0; y <multiArray.length; y++)
		    	System.out.print(multiArray[x][y]);
		  }
		
		 
	 }

}