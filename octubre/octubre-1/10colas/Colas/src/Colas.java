import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        // Crear una cola utilizando Queue (Cola)
        Queue<String> usuarios = new LinkedList<>();

        // Agregar 5 nombres a la cola
        usuarios.offer("Mauricio");
        usuarios.offer("jibran ");
        usuarios.offer(" VAL ");
        usuarios.offer("Evelyn ");
        usuarios.offer("Alfonso6z ");

        // Eliminar y mostrar 3 elementos de la cola
        for (int i = 0; i < 3; i++) {
            String nombreAEliminar = usuarios.poll();
            System.out.println("El nombre a eliminar es: " + nombreAEliminar);
        }

        // Mostrar el próximo nombre a eliminar
        String proximoNombreAEliminar = usuarios.peek();
        System.out.println("El próximo nombre a eliminar es: " + proximoNombreAEliminar);
    }
}
