import java.util.Deque;
import java.util.LinkedList;

public class Pilas {
    public static void main(String[] args) {
        // Crear una pila utilizando Deque (Double-ended Queue)
        Deque<String> camisas = new LinkedList<>();

        // Agregar tres camisas a la pila
        camisas.push("Camisa 1");
        camisas.push("Camisa 2");
        camisas.push("Camisa favorita");

        // Imprimir la última camisa agregada
        System.out.println("La última camisa agregada es: " + camisas.peek());

        // Imprimir las camisas sacadas de la pila mientras no esté vacía
        while (!camisas.isEmpty()) {
            String camisa = camisas.pop();
            System.out.println("Se ha sacado la camisa: " + camisa);
        }
    }
}
