package courses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReader {

	public static void main(String[] args) {
		File file = new File( " hello.txt");
		try {
			file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			writer.write(" Hello from created file ");
			writer.flush();
			writer.close();
			

			BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
			String line;
			 while (( line = reader.readLine()) != null) {
			 System.out.println(line);	
			}
			 
			
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	
	
	}

	
}

 