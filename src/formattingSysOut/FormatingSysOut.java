package formattingSysOut;

public class FormatingSysOut {
	public static void main(String[] args) {
		
		

		
		System.out.println("Power of two table");
		System.out.println();
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",  7, "128","","" );
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n", 8, "256","","");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",10,"1,024","1 Thousand","1 k");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",16,"65,536","     ","64 k");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",20,"1,048,576","1 Million","1 mb");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",30,"1,073,741,824","1 Billion","1 gb");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",32,"4,294,967,296","4.2 Billion","4 gb");
		System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",40,"1,099,511,627,776","1 Trillion","1 tb");
		
		System.out.println();
		System.out.println("Note: \n The colons and semi colons are just for appearance of finished text. \n They're not necessary in using this type of formating. \n The stuff inside the first set of quotes is how the complete sentence looks. \n The %d is where the stuff outside the quotes are put in. \n The %d works for decimals, the %s works with Strings. \n The numbers between can be negative or postitive are are assigning that amount of space within which the item is to be placed. \n The stuff to the right of the main quotes start with and are separated by commas. \n In this example the numbers were set as Strings as I wanted the commas to show in the integers. \n THIS IS A VERY IMPORATANT TABLE TO KNOW. MEMORISE IT!!");
	}

}
