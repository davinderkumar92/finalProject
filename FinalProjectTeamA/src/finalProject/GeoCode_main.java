package finalProject;

import java.util.Scanner;

public class GeoCode_main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the address componets separated by pipe(|)");
		
		Scanner keyboard = new Scanner(System.in);
		String address = keyboard.nextLine();
		
		
GeoCode.performSearch(address);

	}

}
