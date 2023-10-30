import java.util.Scanner;

public class VariablesTex {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("Ingresa tu nombre completo: ");
        nombre = datos.nextLine();

        System.out.print("Ingresa tu edad: ");
        edad = datos.nextInt();

        if (edad > 18) {
            System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y eres mayor de edad.");
        } else {
            System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y eres menor de edad.");
        }

        int numCaracteres = nombre.length();
        System.out.println("Tu nombre tiene " + numCaracteres + " caracteres.");
    }
}
