package source;

import source.entidades.Ecuacion;
import source.entidades.Viajero;

public class Main {

    public static void main(String[] args) {
        
        // PROBLEMA 1
        System.out.println("Ejercico 1:");
        Viajero juan = new Viajero("Juan", "Masculino");
        juan.viajar(30, "Compacto"); 
        
        // PROBLEMA 2
        System.out.println("\nEjercico 2:");
        Integer[] miArray = {1, 5, 4};
        Ecuacion e = new Ecuacion(miArray);
        e.resolver();
    }

}
