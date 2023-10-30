import java.util.ArrayList;

public class EsteticaDePerros {
    public static void main(String[] args) {
        ArrayList<RecibeMMascota> perrosEnEstetica = new ArrayList<>();
    
        RecibeMMascota perro1 = new RecibeMMascota("Bucky", 5, "Husky", "Grande","Juan");
    
        RecibeMMascota perro2 = new RecibeMMascota("Luna", 2, "Golden Retriever", "Mediano", "Maria");
        
        perrosEnEstetica.add(perro1);
        perrosEnEstetica.add(perro2);

        // Imprimir la cantidad de perros en la estética
        System.out.println("Perros actuales en la estética: " + perrosEnEstetica.size());
        
    }
    
}
