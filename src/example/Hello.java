
package example;

import org.apache.commons.lang.WordUtils;
import com.opencsv.CSVReader;
import java.io.FileReader;


public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
    	int monmax=0;
		CSVReader reader=new CSVReader(new FileReader("data.csv"));
		list<String[]> myEntries = reader.readAll();
    }
}
        
