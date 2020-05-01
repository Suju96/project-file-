package myclass;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileClass {

	
	public static void main(String[] args) {
		
		try {
			// create a file path
			File f= new File("C:/Users/HITESHREE/Desktop/myfolder/my.txt");
			
			/* creat a folder...
			File f1= new File("C:/Users/HITESHREE/Desktop/myfolder1");
			f1.mkdir();
			*/
			
			Scanner scan= new Scanner(System.in);
			String msg;
			System.out.println("Enter msg : ");
			msg=scan.nextLine();
			
			FileWriter fw= new FileWriter(f);
			fw.write(msg);
			fw.close();
			System.out.println("Successfully created...");
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();// TODO: handle exception
		}
	}

}
