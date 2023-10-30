public class Arreglos {
    /**
     * @param args  Crea un arreglo llamado "numeros" con los elementos dados.
                    Realiza un ciclo que recorre todo el arreglo e imprime la posición y el número correspondiente.

     */
    public static void main(String[] args) {
        int[] numeros = {12, 10, 4 ,24, 5, 9};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo en la posición " + i + " tiene el número " + numeros[i] + ".");
        }
    }
    
}
