
//(ABRIR ARCHIVO Y SOLO LEER)
package proyecto_agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import proyecto_agenda.EscrituraInfoPersonal;
import proyecto_agenda.Datos_Personales;



public class LecturaInfoPersonal extends EscrituraInfoPersonal
{
    
    public void AbrirArchivo()  throws IOException
    {
        try
        {
         FileInputStream fis=new FileInputStream("c:/Agenda.txt");
         BufferedReader buffer=new BufferedReader(new FileReader(fis.getFD()));
         String linea;
         linea=buffer.readLine();
         
         System.out.println(linea);   //SOLO LEE LA LINEA     
         }//Fin del try
         catch(FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado");
        }//Fin del catch
        catch(NullPointerException e)
          {
            System.out.println("Puntero nulo");
          }//Fin del 2do catch
        
    }//Fin del metodo AbrirArchivo
}//Fin de la clase
