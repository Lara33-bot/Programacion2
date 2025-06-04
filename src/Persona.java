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
       public int getEdad(){
              return edad;
       }
       public String getDireccion(){
              return direccion;
       }
       public String getTelefono(){
              return telefono;
       }

       public void setNombre (String nombre){
              if (nombre != null && !nombre.trim().isEmpty() && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")){
                     this.nombre = nombre;
              }
              else
              {
                     this.nombre = "No registrado";
              }
       }
       public void setApellido (String apellido){
              if (nombre != null && !nombre.trim().isEmpty() && apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")){
                     this.apellido = apellido;
              }
              else
              {
                     this.apellido = "No registrado";
              }
       }
       public void setNumeroIdentificacion(String numeroIdentificacion) {
              if (numeroIdentificacion != null && !numeroIdentificacion.trim().isEmpty()) {
                     this.numeroIdentificacion = numeroIdentificacion;
              } else {
                     this.numeroIdentificacion = "No registrado";
              }
       }
       public void setEdad (int edad){
              if (edad > 0 && edad < 100){
                     this.edad = edad;
              }
              else {
                     this.edad = 0;
              }
       }
       public void setDireccion(String direccion) {
              if (direccion != null && !direccion.trim().isEmpty()) {
                     this.direccion = direccion;
              } else {
                     this.direccion = "No registrada";
              }
       }
       public void setTelefono(String telefono) {
              if (telefono != null && !telefono.trim().isEmpty()) {
                     this.telefono = telefono;
              } else {
                     this.telefono = "No registrado";
              }
       }
       public void mostrarDatosP (){
              System.out.println("Nombre:" + getNombre());
              System.out.println("Apellido:" + getApellido());
              System.out.println("Numero Identificacion:" + getnumeroIdentificacion());
              System.out.println("Edad:" + getEdad());
              System.out.println("Direccion:" + getDireccion());
              System.out.println("Telefono:" + getTelefono());
       }
}