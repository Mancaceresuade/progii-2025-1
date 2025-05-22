
public class App {

    //
    // Ejercicio dada una matriz, 
    // calcular la suma de todos los numeros 
    // multiplos 5
    // 


    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3,5},
            {4, 5, 6,8},
            {7, 8, 9,4}
        };
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);

        //Nota<Integer> nota = new Nota<>();
        //nota.imprimirNota(8);
        //Nota<String> nota = new Nota<>();
        //nota.imprimirNota("Alcanzó los objetivos de aprendizaje");
        /*
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumaNumeros(arr));
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sumaMatriz(matriz));
         */
    }

    /*
    private static int sumaMatriz(int[][] matriz) {
        int suma = 0; // 1
        for (int i = 0; i < matriz.length; i++) { // 1  n 2n
            suma = sumaFila(matriz[i]); // n * h(n)
        }
        return suma; //1
    }
    */    
    // complejidad supuniendo que la matriz es cuadrada n x n
    // f(n) = 1 + 1 + 2n + 2n + n * h(n) + 1
    // f(n) = 3 + 4n + n * (4n+3)
    // f(n) = 3 + 4n + 4n^2 + 3n = 4n^2 + 7n + 3 => O(n^2)
    // c = ? n0 = ?
    // tomo c = 5  (4+1)
    // 4n^2 + 7n + 3 <= 5n^2
    // simplifico 4n^2
    // 7n + 3 <= n^2   
    // n = 1  => 7 + 3 <= 1^2 => 10 <= 1 (no se cumple)
    // n = 2  => 7*2 + 3 <= 2^2 => 14 + 3 <= 4 (no se cumple)
    // n = 3  => 7*3 + 3 <= 3^2 => 21 + 3 <= 9 (no se cumple)
    // n = 4  => 7*4 + 3 <= 4^2 => 28 + 3 <= 16 (no se cumple)
    // n = 5  => 7*5 + 3 <= 5^2 => 35 + 3 <= 25 (no se cumple)
    // n = 6  => 7*6 + 3 <= 6^2 => 42 + 3 <= 36 (no se cumple)
    // n = 7  => 7*7 + 3 <= 7^2 => 49 + 3 <= 49 (no se cumple)
    // n = 8  => 7*8 + 3 <= 8^2 => 56 + 3 <= 64 (se cumple)
    // f(n) pertenece a O(n^2) para n >= 8 y c = 5

    /*
    private static int sumaFila(int[] fila) {
        int suma = 0; // 1
        for (int i = 0; i < fila.length; i++) { // 1  n 2n
            suma += fila[i]; // 2n
        }
        return suma; //1
    } // 1 2n + 1 + 2n + 1 = 4n + 3 = h(n) 
    */
    /*
    private static int sumaNumeros(int[] arr) {
        int suma = 0; // 1
        for (int i = 0; i < arr.length; i++) { // 1  2n 2n
            suma += arr[i]; // 2n
        }
        return suma; //1
    } // 1 2n + 1 + 2n + 1 = 4n + 3 = f(n) => O(n)
     */
}