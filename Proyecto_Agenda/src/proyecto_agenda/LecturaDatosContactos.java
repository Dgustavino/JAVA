
//(LEER INFO CONTACTOS ACCESO SECUENCIAL)
//(metodo BUSCAR_CEDULA() aleatorio
package proyecto_agenda;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LecturaDatosContactos 
{
   public void AbrirArchivoC()  throws IOException
    {
        try
        {
         FileInputStream fis=new FileInputStream("Agenda2.txt");
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
 

