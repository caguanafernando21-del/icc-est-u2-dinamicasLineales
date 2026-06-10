import java.util.Stack;

public class Ejercicio2 {
    public boolean esPalindromo(String texto) {
           
        Stack<Character> pila = new Stack<>();
        
       
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        
       
        for (int i = 0; i < texto.length(); i++) {
       
            if (texto.charAt(i) != pila.pop()) {
                return false; 
            }
        }
        
        return true; 
    }




}
