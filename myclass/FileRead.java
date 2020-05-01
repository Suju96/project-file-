package myclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {

	
	public static void main(String[] args) {
		try {
			
			File f= new File("C:/Users/HITESHREE/Desktop/myfolder/my.txt");
			String msg="",line;
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			
				while((line=br.readLine())!= null)
				{
					msg=msg+line+"\n";
				}
				
			System.out.println("Data  :"+msg);
			System.out.println("closed");
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
