
//(CREAR ARCHIVO,ALMACENAR,SALIR)

package proyecto_agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import proyecto_agenda.Datos_Personales;

public class EscrituraInfoPersonal 
{
    File Archivo;
    FileWriter fw;
    BufferedWriter bw;
    
    public void CrearArchivo() throws IOException 
    {
         Archivo=new File("Agenda.txt");
         
    }//Fin del metodo CrearArchivo
    
    public void AgregarDatos_Personales() throws IOException
    {
        Datos_Personales datos=new Datos_Personales("","","","","","","","");
        
        datos.EstablecerNombre("Diego");
        datos.EstablecerApellidoP("Venegas");
        datos.EstablecerApellidoM("Gustavino");
        datos.EstablecerCedula("603940973");
        datos.EstablecerEdad("27");
        datos.EstablecerTelefono("8913 7181");
        datos.EstablecerCorreo("Dgustavino@gmail");
        datos.EstablecerDireccion("Cartago");
        try
        {
            if(Archivo.exists())
            {
                fw=new FileWriter(Archivo,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(datos.ObtenerNombre()+"/"+datos.ObtenerApellidoP()+"/"+datos.ObtenerApellidoM()+"/"
                        +datos.ObtenerEdad()+"/"+datos.ObtenerCedula()+"/"+datos.ObtenerTelefono()+"/"+
                                   datos.ObtenerDireccion()+"/"+datos.ObtenerCorreo());
            }//Fin del if
            else
            {
                fw=new FileWriter(Archivo);
                bw=new BufferedWriter(fw);
                bw.write(datos.ObtenerNombre()+"/"+datos.ObtenerApellidoP()+"/"+datos.ObtenerApellidoM()+"/"
                        +datos.ObtenerEdad()+"/"+datos.ObtenerCedula()+"/"+datos.ObtenerTelefono()+"/"+
                                   datos.ObtenerDireccion()+"/"+datos.ObtenerCorreo());
            }//Fin del else 
        }//Fin del try
             catch(FileNotFoundException fileNotFoundException)
             {
                 System.out.println("No existe Archivo");
             }//Fin del catch
    }//Fin del metodo AgregarDatosPersonales
    
    public void CerrarArchivo() throws IOException
    {
        bw.close();
        fw.close();
    }//Fin del metodo CerrarArchivo
    
}//Fin de la clase
