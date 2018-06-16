package dynamicdatastorage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
 public static void main(String[] args) throws IOException{
 File file = new File("C:\\Users\\Sahil\\eclipse-workspace\\DynamicDataFile\\src\\dynamicdatastorage\\abc.txt");
 			if(!file.exists())
 			{
 			file.createNewFile();
 			}
 
		    FileReader in = null;
		    try {
		        in=new FileReader(file);
		      int ch;
		      while((ch=in.read())!=-1) {
		           System.out.print((char)ch);
		           }

		      System.out.println("\nPath of this file is : "+file.getPath()); //tell path of file
		    }
		    catch(Exception e) {
		        System.out.println("Exception is "+e.getMessage());
		    }
		      finally {
		       if(in!=null)
		       in.close();
		       }
		    }

}
