package finalProject;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GeoCode_main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the address in format {number street name direction city province country}");
		
		Scanner keyboard = new Scanner(System.in);
		String address = keyboard.nextLine();
	
		
		 String delims = "[ ]+";
		 String[] tokens = address.split(delims);
		 if(tokens.length !=6){
			 System.out.println("Entered address is incomplete.please enter the full address in format {number street name direction city province country");
		 }
		 else{
		 String streetNumber = tokens[0];
		 String streetName = tokens[1]+ tokens[2];
		 
		 String city = tokens[3];
		 String country = tokens[4];
		String province  = tokens[5];
		
		 GeoCode.performSearch(address,streetNumber,streetName,city,province,country);

		
		//GeoCode.performSearch(tokens);
}
}}