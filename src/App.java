import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkList(); //
        runQueue();
        runStack();

    }

    private static void runStack() {
        // Stack<String> pila = new Stack<>();
        ArrayDeque<String> pila = new ArrayDeque<>();
 
        pila.push("Jose");
        pila.push("Adnres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");
 
        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
 
        System.out.println(pila.peek()); // Maria2
        System.out.println(pila.size()); // 5
 
        System.out.println(pila.pop()); // Maria2 SALIO
        System.out.println(pila.size()); // 4
 
        while (!pila.isEmpty()) {
            String cliente = pila.pop();
            System.out.println("Sale -> " + cliente);
        }
        System.out.println(pila.size()); // 0
 
    }

    private static void runQueue() {
       Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andrea");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek()); // -> primer usuario
        System.out.println(cola.size()); // tamaño
        System.out.println(cola.poll()); // -> "Jose" y lo saca
        System.out.println(cola.size()); //  2

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


        String primero = nombres.getFirst(); // devuelve un string (ya que la lista es string)
        System.out.println(primero);
        System.out.println(nombres.get(3));
        System.out.println(nombres.getLast()); //ultima posicion

        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    
    
  
        // 1. Instanciamos la clase de forma segura dentro del main
        Ejercicio1 inicio = new Ejercicio1();
        
        String texto = "COMPUTACION";
        
        // 2. Llamamos al método pasando solo la variable (sin anteponer 'String')
        String textoInvertido = inicio.invertString(texto);
        
        // Imprime: NOICATUPMOC
        System.out.println(textoInvertido); 
    }
}
