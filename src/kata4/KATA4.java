
package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Tenemos que crear un array que sea List
        String nameFile = "/home/guise/Escritorio/emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        System.out.println(mailArray.size());
        
        Histogram <String> histogram = MailHistogramBuilder.build(mailArray);
        
        
        
        new HistogramDisplay(histogram).execute();
        
        
    }
    

}
