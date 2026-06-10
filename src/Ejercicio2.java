import java.util.Stack;

public class Ejercicio2 {
    public boolean esPalindromoConPila(String texto) {
        // 1. Creamos una pila de caracteres
        Stack<Character> pila = new Stack<>();
        
        // 2. Metemos (push) cada letra del texto dentro de la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        
        // 3. Comparamos el texto original letra por letra con lo que sale de la pila
        for (int i = 0; i < texto.length(); i++) {
            // pop() saca el elemento de arriba (que es el último que entró)
            if (texto.charAt(i) != pila.pop()) {
                return false; // Si una letra no coincide, no es palíndromo
            }
        }
        
        return true; // Si coincidieron todas, sí es palíndromo
    }




}
