import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        Persona p = new Persona();

        System.out.print("Ingrese el nombre: ");
        String nombre = input.nextLine();
        p.setNombre(nombre);

        System.out.print("Ingrese el apellido: ");
        p.setApellido(input.nextLine());

        System.out.print("Ingrese su número de identificación: ");
        p.setNumeroIdentificacion(input.nextLine());

        System.out.print("Ingrese su edad: ");
        p.setEdad(input.nextInt());
        input.nextLine();

        System.out.print("Ingrese su dirección: ");
        p.setDireccion(input.nextLine());

        System.out.println("Ingrese su teléfono: ");
        p.setTelefono(input.nextLine());

        System.out.println(" Datos ingresados ");
        p.mostrarDatosP();
    }
    }
//Lara Demasi
//prueba