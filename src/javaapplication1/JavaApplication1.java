package javaapplication1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Igor Pereira Vidal
 */
public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream("codigoALGUMA2.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader entrada = new BufferedReader(isr);
        
        Lexico lexico = new Lexico();
        lexico.setInput(entrada);
        
        try
        {
            Token t = null;
            while((t = lexico.nextToken()) != null){
                System.out.println(t.toString());
            }
        }
        catch(LexicalError e) 
        {
            System.err.println(e.getMessage() + " em " + e.getPosition());
        }
    }
}
