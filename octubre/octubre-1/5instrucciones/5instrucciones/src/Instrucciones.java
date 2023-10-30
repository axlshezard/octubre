/*
 * 
 * Programa 1. (3 puntos) Crea el código en Java bajo las siguientes instrucciones:

a) Importa la clase Scanner para la lectura de datos.
b) Crea un objeto semana de la clase Scanner.
c) Crea una variable dia de tipo entero.
d) Imprime el texto Introduce un número del 1 al 7 para conocer el día de la semana, para hacer la lectura de el dato desde teclado y almacenarlo en la variable dia.
e) Crea una estructura switch-case, donde la variable a comparar con todos los casos es dia.
f) En cada caso, coloca e imprime cada día de la semana (comenzando el Lunes).
g) Si se ingresa un número de día no válido, imprime el mensaje Número no válido.

public class app {
 */
/* a) */import java.util.Scanner;


public class Instrucciones  {
    public static void main(String[] args) {
/*b) */ Scanner semana = new Scanner(System.in);    
/*c) */ int dia;

/*d) */System.out.println("Introduce un número del 1 al 7 para conocer el día de la semana:");
        dia = semana.nextInt();
/*e) */ switch (dia) {
            case 1:
            System.out.println("Lunes");
                
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
/*f) */         System.out.println("Domingo");
                break;
            default:
/*g) */         System.out.println("Numeros no validos");
                break;
        }
    }

}
