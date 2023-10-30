/*
 * UML
 * class RecibeMMascota {
 * -nombrePerro: String
 * -edad: int
 * raza: String
 * -tmaño: String
 * - nombreDueño: String
}

*/
import java.util.ArrayList;
//declaramos las variables
public class RecibeMMascota{
    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamaño;
    private String nombreDueño;
//constructor
    public RecibeMMascota(String nombrePerro, int edad, String raza, String tamaño, String nombreDueño) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombreDueño = nombreDueño;
    }
//Getters y Setters
    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
    

        
}
