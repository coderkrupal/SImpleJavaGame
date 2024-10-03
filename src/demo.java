package com.mystudypedia;
import java.util.Scanner;

import javax.naming.directory.NoSuchAttributeException;

//import com.mystudypedia.university.department;

public class demo {
	


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("which type of game do you enter[outdoor/indoor] (and in outdoor/indoor)");
		String choiceString=scanner.nextLine();
		if(choiceString.contentEquals("outdoor")) {
			
	       System.err.println("----------------------------------------------------------------");
	       System.err.println("-------------------welcome to outdoor game-------------------------");
	       System.err.println("-------------------1:cricekt-----------------------------------------");
	       System.err.println("-------------------2:kabbadi------------------------------------------");
	       System.err.println("-------------------3:vollyball-----------------------------------------");
	       System.err.println("-------------------4:carrom-------------------------------------------");
	       System.err.println("----------------------------------------------------------------");
	       System.err.println("");
	       
	}
		else {
			  System.err.println("----------------------------------------------------------------");
		       System.err.println("-------------------welcome to indoor game-------------------------");
		       System.err.println("-------------------1:carrom-----------------------------------------");
		       System.err.println("-------------------2:table-tennis------------------------------------------");
		       System.err.println("-------------------3:ludo-----------------------------------------");
		       System.err.println("-------------------4:pubg-------------------------------------------");
		       System.err.println("----------------------------------------------------------------");
		}

}
}
