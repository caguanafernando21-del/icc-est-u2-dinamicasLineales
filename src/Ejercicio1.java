import java.util.Stack;

public class Ejercicio1 {

    public String invertirTexto(String texto) {
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        
        String invertida = "";
        while (!pila.isEmpty()) {
            invertida += pila.pop(); 
        }
        
        return invertida;
    }

}