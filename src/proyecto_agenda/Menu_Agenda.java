
package proyecto_agenda;

import java.io.IOException;
import java.util.Scanner;


public class Menu_Agenda 
{

    
    public static void main(String[] args) throws IOException 
    {
       Seguridad aplicacion5 = new Seguridad();
       aplicacion5.Seguridad();
       
       Scanner lector = new Scanner(System.in);
       int opc=0;
       while (opc!=5)
       {
          System.out.println("---Menu---");
          System.out.println("1.ESCRITURA DATOS PERSONALES");
          System.out.println("2.LECTURA DATOS PERSONALES");
          System.out.println("3.ESCRITURA DE CONTACTOS");
          System.out.println("4.LECTURA DE CONTACTOS");
          System.out.println("5.SALIR");
          opc = lector.nextInt();
          switch(opc)
          {
              case 1:
                       EscrituraInfoPersonal aplicacion=new EscrituraInfoPersonal();
                       aplicacion.CrearArchivo();
                       aplicacion.AgregarDatos_Personales();
                       aplicacion.CerrarArchivo();
                       System.out.println("Agenda creada");
              break;
              case 2:
                      LecturaInfoPersonal aplicacion2=new LecturaInfoPersonal();
                      aplicacion2.AbrirArchivo();
              break;
               
              case 3:
                      EscrituraDatosContactos aplicacion3=new EscrituraDatosContactos();
                      aplicacion3.CrearArchivoContacto();
                      aplicacion3.AgregarDatos_Contactos();
                      aplicacion3.CerrarArchivoC();
              break;
              case 4:    
                      LecturaDatosContactos aplicacion4=new LecturaDatosContactos();
                      aplicacion4.AbrirArchivoC();
              break;
              case 5:
                   break;
              default:
                       System.out.println("Opcion no valida");
                   break;
          }//Fin de switch
        }//Fin de while
    }//Fin del main
}//Fin de la clase
