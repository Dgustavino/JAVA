
package proyecto_agenda;

//USUARIO

import java.util.Scanner;

//CONTRASEÑA("123")

public class Seguridad 
{
              public void Seguridad(){  
		String login=null;
		String pass=null;
                Scanner lector=new Scanner(System.in);   
      
                {      
                System.out.println(" Ingrese su Usuario:");//Se pide un dato al usuario
                login = lector.nextLine();
                System.out.println("Ingrese su clave:");//Se pide un dato al usuario
                pass = lector.nextLine();
                }
                
                {  
                  if(login.equals("Admin")&& pass.equals("123")) {System.out.print("BIENVENIDO ADMINISTRADOR\n");}
                  else
                  if(login.equals("Usuario01")&& pass.equals("456")) {System.out.print("BIENVENIDO USUARIO\n");}
                  else
                  if(login.equals("Usuario02")&& pass.equals("789")) {System.out.print("BIENVENIDO USUARIO\n");}
                  else
                    {System.out.print("Error");}
               
                }
                }
}//Fin de la clase