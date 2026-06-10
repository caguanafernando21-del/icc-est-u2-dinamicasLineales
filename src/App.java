import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("--- 1. EJECUCION DE LINKEDLIST ---");
        runLinkList(); 
        
        System.out.println("\n--- 2. EJECUCION DE QUEUE  ---");
        runQueue();
        
        System.out.println("\n--- 3. EJECUCION DE STACK (PILA) ---");
        runStack();

        System.out.println("\n--- 4. EJECUCION DE EJERCICIOS DE CADENAS ---");
        runEjerciciosCadenas(); 
    }

    // ==========================================
    // EJERCICIOS DE ALGORITMOS (TUS MÉTODOS)
    // ==========================================

    // Tu método para invertir texto en español
    public String invertirTexto(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public boolean esPalindromo(String texto) {
        Stack<Character> pilaAuxiliar = new Stack<>();
        
        for (int i = 0; i < texto.length(); i++) {
            pilaAuxiliar.push(texto.charAt(i));
        }
        
        String textoInvertido = "";
        while (!pilaAuxiliar.isEmpty()) {
            textoInvertido += pilaAuxiliar.pop();
        }
        
        return texto.equals(textoInvertido);
    }

    

    private static void runEjerciciosCadenas() {
        App utilidades = new App();
        
        String textoOriginal = "COMPUTACION";
        String resultadoInversion = utilidades.invertirTexto(textoOriginal);
        System.out.println("[Ejercicio 1] Original: " + textoOriginal + " -> Invertido: " + resultadoInversion);
        


        String caso1 = "radar";
        String caso2 = "computacion";
        System.out.println("[Ejercicio 2] " + caso1 + "' es palíndromo?: " + utilidades.esPalindromo(caso1));
        System.out.println("[Ejercicio 2] " + caso2 + "' es palíndromo?: " + utilidades.esPalindromo(caso2));
    }

    private static void runStack() {
        ArrayDeque<String> pila = new ArrayDeque<>();
        
        pila.push("Jose");
        pila.push("Adnres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");
 
        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
 
        System.out.println(pila.peek()); 
        System.out.println(pila.size()); 
 
        System.out.println(pila.pop()); 
        System.out.println(pila.size());
 
        while (!pila.isEmpty()) {
            String cliente = pila.pop();
            System.out.println("Sale -> " + cliente);
        }
        System.out.println(pila.size()); 
    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andrea");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek()); 
        System.out.println(cola.size()); 
        System.out.println(cola.poll()); 
        System.out.println(cola.size()); 

        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("Atendi a " + cliente);
        }
    }

    private static void runLinkList() {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        String primero = nombres.getFirst(); 
        System.out.println(primero);
        System.out.println(nombres.get(3));
        System.out.println(nombres.getLast()); 

        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
}