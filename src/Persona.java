public class Persona {
       private String nombre;
       private String apellido;
       private String numeroIdentificacion;
       private int edad;
       private String direccion;
       private String telefono;

       public Persona(){      //constructor
              this.nombre= "nombre";
              this.apellido = "apellido";
              this.numeroIdentificacion = "numeroIdentificacion";
              this.edad = 0;
              this.direccion = "direccion";
              this.telefono = "telefono";

       }

       public String getNombre(){
              return nombre;
       }
       public String getApellido(){
              return apellido;
       }
       public String getnumeroIdentificacion(){
              return numeroIdentificacion;
       }
       public int getedad(){
              return edad;
       }
       public String getdireccion(){
              return direccion;
       }
       public String gettelefono(){
              return telefono;
       }

       public void setNombre (String nombre){
              if (nombre != null && !nombre.trim().isEmpty()){
                     this.nombre = nombre;
              }
              else
              {
                     this.nombre = "No registrado";
              }
       }
       public void setEdad (int edad){
              if (edad > 0){
                     this.edad = edad;
              }
              else {
                     this.edad = 0;
              }
       }
}