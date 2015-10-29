
package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;


public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    String pathName = "/home/guise/Descargas";
    File file = new File(pathName);
    String [] dire = file.list();
       // for (String dire1 : dire) {
        //    System.out.println(dire1);
       // }
    
    //Uno con Input y otro con Output
    String from = "/home/guise/Imágenes/Selección_003.png";
    String to = "/home/guise/Imágenes/Selección_003(1).png";
        //Capas de cebolla
    BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File (from)));
    BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
    
    //Ahora con el byte, que e
    byte[] buffer = new byte[1024];
    
    
    Date date = new Date();
    while(true){
        int read = input.read(buffer);
        if(read <0) break;
        output.write(buffer);
    }
    //Así se cuánto tiempo tarda en copiar
    System.out.println(new Date().getTime()-date.getTime()+ "msg");
    input.close();
    output.flush();
    output.close();
    
    print(file.listFiles(),"");
    }
    
    //A medida que voy entrando en profundidad le voy poniendo espacios en blanco
    private static void print(File[] listFiles, String ident) {
        if(listFiles==null){
            return;
        }
        
        for (File listFile : listFiles) {
            //Que imprima un + si es un directorio, si es un fichero un espacio y una flecha
            System.out.println(ident+(listFile.isDirectory()? "+":" ")+listFile.getName());
            if(listFile.isFile() || listFile.isHidden()) continue;
            //Al fichero le paso su lista de files
            print (listFile.listFiles(), ident + " -> ");
        }
                
        
    }
    
    
}
