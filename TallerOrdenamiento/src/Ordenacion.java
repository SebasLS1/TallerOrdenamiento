public class Ordenacion {

    public static void burbujaMenorMayor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void burbujaMayorMenor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método Inserción
    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Método Selección
    /*
     * ALGORITMO Selección
ENTRADA: Un arreglo de enteros arr[] de tamaño n
SALIDA: El arreglo arr[] ordenado en orden ascendente

1. PARA i DESDE 0 HASTA n-2 HACER
   1.1. Inicializar min_idx con el valor de i
        min_idx <- i
        
   1.2. PARA j DESDE i+1 HASTA n-1 HACER
        1.2.1. SI el valor de arr[j] es menor que el valor de arr[min_idx], ENTONCES
               SI arr[j] < arr[min_idx] ENTONCES
                  Actualizar min_idx para que sea igual a j
                  min_idx <- j
               FIN SI
        FIN PARA
        
   1.3. SI min_idx es diferente de i, ENTONCES
        SI min_idx ≠ i ENTONCES
           Intercambiar los valores de arr[min_idx] y arr[i]
           temp <- arr[min_idx]
           arr[min_idx] <- arr[i]
           arr[i] <- temp
        FIN SI
FIN PARA

     */
    public static void seleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
