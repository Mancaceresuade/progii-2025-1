import java.util.HashMap;

public class Ejercicio {
    public static void main(String[] args) {
        HashMap<Integer, String> capitulos = new HashMap<>();
        capitulos.put(1, "Introducción a Java");
        capitulos.put(2, "Estructuras de Control");
        capitulos.put(3, "Estructuras de Datos");   
        capitulos.put(4, "Programación Orientada a Objetos");    
        capitulos.get(2); // O(1)
        System.out.println(capitulos.get(2)); // O(1)
        for (int i = 1; i <= capitulos.size(); i++) {
            System.out.println("Capítulo " + i + ": " + capitulos.get(i)); 
        }
        for (Integer i : capitulos.keySet()) {
            System.out.println("Capítulo " + i + ": " + capitulos.get(i)); 
        }
        for (String s : capitulos.values()) {
            System.out.println("Capítulo: " + s); 
        }
        for (HashMap.Entry<Integer, String> entry : capitulos.entrySet()) {
            System.out.println("Capítulo " + entry.getKey() + ": " + entry.getValue()); 
        }
        capitulos.entrySet().forEach(entry -> { System.out.println("Capítulo " + entry.getKey() + ": " + entry.getValue());        });
    }   
}
