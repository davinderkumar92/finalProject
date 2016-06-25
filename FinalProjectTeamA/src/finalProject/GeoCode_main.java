package finalProject;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GeoCode_main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the address componets separated by pipe(|)");
		
		Scanner keyboard = new Scanner(System.in);
		String address = keyboard.nextLine();
	
		
		 /*String delims = "[ ]+";
		 String[] tokens = address.split(delims);
		 if(tokens.length <5){
			 System.out.println("Entered address is incomplete.please enter the full address in format {number street name direction city country");
		 }
		 else{
		 String number = tokens[0];
		 String streetName = tokens[1];
		 String direction = tokens[2];
		 String city = tokens[3];
		 String country = tokens[4];
		
		*/
		 //GeoCode.performSearch(number,streetName,direction,city,country);

		// }
		GeoCode.performSearch(address);
}
}