package mathDotRandom;

import java.util.Scanner;

public class SwitchStatements {
	public static void main (String []args){
	
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number between 1 and 7");
		int ans1 = sc.nextInt();
		
		switch (ans1){
		case 1 : System.out.println("That's Monday"); break;
		case 2 : System.out.println("That's Tuesday"); break;
		case 3 : System.out.println("That's Wednesday"); break;
		case 4 : System.out.println("That's Thursday"); break;
		case 5 : System.out.println("That's Friday"); break;
		case 6 : System.out.println("That's Saturday"); break;
		case 7 : System.out.println("That's Sunday"); break;
		default:  System.out.println(" Invalid entry \n Happy Java!!"); break;
							
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Type first 3 letters of month in lower case");
		String ans2 = sc2.nextLine();
		
		switch (ans2){
		case "jan" : System.out.println("That's January"); break;
		case "feb" : System.out.println("That's February"); break;
		case "mar" : System.out.println("That's March"); break;
		case "apr" : System.out.println("That's April"); break;
		case "may" : System.out.println("That's May"); break;
		case "jun" : System.out.println("That's June"); break;
		case "jul" : System.out.println("That's July"); break;
		case "aug" : System.out.println("That's August"); break;
		case "sep" : System.out.println("That's September"); break;
		case "oct" : System.out.println("That's October"); break;
		case "nov" : System.out.println("That's November"); break;
		case "dec" : System.out.println("That's December"); break;
		default:  System.out.println(" Invalid entry \n Happy Java!!"); break;
		
		
		}
	}

}

