import java.util.Calendar;
import java.io.File;
import java.util.Scanner;
import java.util.Date;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.FileWriter;
public class main {

	public static void main(String[] args) {
        try 
        {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) 
            {
                System.out.println("File created: "+ Obj.getName());
            }
            else 
            {
            	Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine()) 
                {
                    String data = Reader.next();
                    String num = Reader.next();
                    if(Pattern.matches("[7-9]{1}[0-9]{9}",num));
                    {
                 	 File sc = new File(data+".txt");
                 	 if(sc.createNewFile())
                 	 {
                 		 
                    }
                    else
                    {
                     Calendar cal = Calendar.getInstance();
                     String time=cal.getTime().toString();
                     FileWriter Writer = new FileWriter(data+".txt");
                     Writer.write(time);
                     Writer.close();
                       }
                    }
                }
                Reader.close();
            }
	    }
         
        catch (IOException e) 
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        
    }

}
