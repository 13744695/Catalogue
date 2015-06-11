package mathDotRandom;

import java.text.DecimalFormat;

public class MathDotRandom {
	public static void main(String [] args){
		
		
		 // a simple random number
	     double x = Math.random();
	     System.out.println("Double between 0.0 and 1.0: x = "+x);
	
		         
	
		 // double between [0.0, 20.0)
	     double y = Math.random()*20.0;
	     System.out.println("Double between 0.0 and 20.0: y = "+y);     
	
		 
	     
	     
	     // integer between [3,7]
	     int r1 = (int) (Math.random()*5)+3;
	     System.out.println("Integer between 3 and 8: r1 = "+r1);
	
		         
	
	     
	     // integer between [-10,10) - maximum 9
	     int r2 = (int) (Math.random()*20)-10;
	     System.out.println("Integer between -10 and 10: r2 = "+r2);
		
		
	     // for rounding to two decimal places. 
	     double time = 200.3416;
	     DecimalFormat df = new DecimalFormat("#.##");      
	     time = Double.valueOf(df.format(time));

	     System.out.println(time); // 200.35
		
	}

}
