package clase10;

public class App {
    public static void main(String[] args) {
        Arbol<Integer> arbol = new Arbol<>();
		arbol.agregar(4);
		arbol.agregar(6);
		arbol.agregar(8);
		arbol.agregar(16);
		arbol.agregar(28);
		arbol.agregar(2);
		arbol.agregar(4);
		arbol.imprimirArbolNoEficiente();
    }    
}
