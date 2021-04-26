
//(CREAR ARCHIVO,INGRESAR DATOS Y CERRAR AL SALIR)
package proyecto_agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EscrituraDatosContactos 
{
    File ArchivoContacto;
    FileWriter fw;
    BufferedWriter bw;
    
    public void CrearArchivoContacto() throws IOException 
   {
         ArchivoContacto=new File("Agenda2.txt");
                     
    }//Fin del metodo CrearArchivo
    
    public void AgregarDatos_Contactos() throws IOException
    {
        try
        {
            if(ArchivoContacto.exists())
            {
                fw=new FileWriter(ArchivoContacto);
                bw=new BufferedWriter(fw);
                Scanner lector =new Scanner(System.in);
                
                System.out.println("Escribe el nombre:");
                String nombre=lector.nextLine();
                bw.write(nombre+"/");
                
                System.out.println("Escriba apellidoP:");
                String apellidoP=lector.nextLine();
                bw.write(apellidoP+"/");
                
                System.out.println("Escriba apellidoM:");
                String apellidoM=lector.nextLine();
                bw.write(apellidoM+"/");
                
                System.out.println("Escriba Cedula:");
                String Cedula=lector.nextLine();
                bw.write(Cedula+"/");
                
                System.out.println("Escriba edad:");
                String edad=lector.nextLine();
                bw.write(edad+"/");
                
                System.out.println("Escriba telefono:");
                String telefono=lector.nextLine();
                bw.write(telefono+"/");
                
                System.out.println("Escriba direccion:");
                String direccion=lector.nextLine();
                bw.write(direccion+"/");
                
                System.out.println("Escriba correo:");
                String correo=lector.nextLine();
                bw.write(correo+"/");
                
                System.out.println("***********************");
                  
            }//Fin del if
            else
            {
                fw=new FileWriter(ArchivoContacto);
                bw=new BufferedWriter(fw);
                Scanner lector =new Scanner(System.in);
                
                System.out.println("Escribe el nombre:");
                String nombre=lector.nextLine();
                bw.write(nombre+"/");
                
                System.out.println("Escriba apellidoP:");
                String apellidoP=lector.nextLine();
                bw.write(apellidoP+"/");
                
                System.out.println("Escriba apellidoM:");
                String apellidoM=lector.nextLine();
                bw.write(apellidoM+"/");
                
                System.out.println("Escriba Cedula:");
                String Cedula=lector.nextLine();
                bw.write(Cedula+"/");
                
                System.out.println("Escriba edad:");
                String edad=lector.nextLine();
                bw.write(edad+"/");
                
                System.out.println("Escriba telefono:");
                String telefono=lector.nextLine();
                bw.write(telefono+"/");
                
                System.out.println("Escriba direccion:");
                String direccion=lector.nextLine();
                bw.write(direccion+"/");
                
                System.out.println("Escriba correo:");
                String correo=lector.nextLine();
                bw.write(correo+"/");
                
                System.out.println("***********************");
                  
            }//Fin del else
        }//Fin del try
             catch(FileNotFoundException fileNotFoundException)
             {
                 System.out.println("No existe Archivo");
             }//Fin del catch
    }//Fin del metodo AgregarDatosContacto
    
    public void CerrarArchivoC() throws IOException
    {
        bw.close();
        fw.close();
    }//Fin del metodo CerrarArchivoC
}//Fin de la clase
