package myclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;



public class FileWrite {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		
		
		try 
		{		
			File f = new File("C:/Users/HITESHREE/Desktop/myfolder/name.txt");
		
			
			{
			System.out.println("........... Enter Choice ............. ");
			
			System.out.println("file name: name.txt");
			System.out.println("  1. Read File ");
			System.out.println("  2. write File ");
			System.out.println("  3.  Exit ");
			int i=sc.nextInt();	
			
			if (i==1)
			{
				System.out.println(">> Read The File ");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				

				String line,msg="";
				while((line=br.readLine())!= null)
				{
					 msg = msg+line+"\n";
				}
				System.out.println("Data  :"+msg);
			}
			else if (i==2) 
			{
				Scanner s2= new Scanner(System.in);
				System.out.println(">> Write The File ");
				FileWriter fw= new FileWriter(f);
				String msg;
				System.out.println("Enter msg : ");
				msg=s2.nextLine();
				fw.write(msg);
				fw.close();
				System.out.println("Successfully created...");
				
			}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
