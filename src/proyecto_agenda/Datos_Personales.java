
package proyecto_agenda;

public class Datos_Personales 
{
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Cedula;
    private String Edad;
    private String Telefono;
    private String Direccion;
    private String Correo;
   
//Constructor 
   
   public Datos_Personales(String nombre,String apellidoP,String apellidoM,String cedula,String edad,String telefono,String direccion,String correo)
   {
     nombre=Nombre;
     apellidoP=ApellidoP;
     apellidoM=ApellidoM;
     cedula=Cedula;
     edad=Edad;
     telefono=Telefono;
     direccion=Direccion;
     correo=Correo;
   }//Fin del constructor
   
   //Metodos
   public void EstablecerNombre(String nombre)
   {
       Nombre=nombre;
   }
   public String ObtenerNombre()
   {
       return Nombre;
   }
   //**********************************************//
   public void EstablecerApellidoP(String apellidoP)
   {
       ApellidoP=apellidoP;
   } 
   public String ObtenerApellidoP()
   {
       return ApellidoP;
   }
   //************************************************//
   public void EstablecerApellidoM(String apellidoM)
   {
       ApellidoM=apellidoM;
   }
   public String ObtenerApellidoM()
   {
       return ApellidoM;
   }
   //***************************************************//
   public void EstablecerCedula(String cedula)
   {
       Cedula=cedula;
   }
   public String ObtenerCedula()
   {
       return Cedula;
   }
   //***************************************************//
   public void EstablecerEdad(String edad)
   {
       Edad=edad;
   }
   public String ObtenerEdad()
   {
       return Edad;
   }
   //*******************************************************//
   public void EstablecerTelefono(String telefono)
   {
       Telefono=telefono;
   }
   public String ObtenerTelefono()
   {
       return Telefono;
   }
   //****************************************************//
   public void EstablecerDireccion(String direccion)
   {
       Direccion=direccion;
   }
   public String ObtenerDireccion()
   {
       return Direccion;
   }
   //************************************************//
   public void EstablecerCorreo(String correo)
   {
       Correo=correo;
   }
   public String ObtenerCorreo()
   {
       return Correo;
   }
   //************************************************//
   
   public void contactos()
   {
       System.out.println("Nombre:"+ObtenerNombre());
       System.out.println("ApellidoP:"+ObtenerApellidoP());
       System.out.println("ApellidoM:"+ObtenerApellidoM());
       System.out.println("Cedula:"+ObtenerCedula());
       System.out.println("Edad:"+ObtenerEdad());
       System.out.println("Telefono:"+ObtenerTelefono());
       System.out.println("Direccion:"+ObtenerDireccion());
       System.out.println("Correo:"+ObtenerCorreo());
        
   }//Fin del metodo DesplegarAgenda   
}//Fin de la clase Datos_personales
