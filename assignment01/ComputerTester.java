package assignment01;
/**
 * Class to test the Computer Class.
 * 
 * @author Jason Vail 
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	
	Computer comp1 = new Computer("Apple", "Good", 20, 1500, true, 2000); 
	Computer comp2 = new Computer("Apple", "Good", 20, 1500, false, 2000); 
	Computer comp3 = new Computer("Apple", "Good", 20, 900, true, 2000); 
	Computer comp4 = new Computer("Apple", "Good", 20, 900, false, 2000); 
	
	System.out.println(comp1);
	System.out.println(comp2);
	System.out.println(comp3);
	System.out.println(comp4);
		

	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.	


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
