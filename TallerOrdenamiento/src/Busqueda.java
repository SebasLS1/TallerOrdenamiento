public class Busqueda {
/**
 * 
 * @param arr
 * @param x Un arreglo de enteros arr[] de tamaño n, y un entero x que representa el valor a buscar
 * @return El índice del valor x en el arreglo arr[], o -1 si x no se encuentra en el arreglo
1. PARA i DESDE 0 HASTA n-1 HACER
   1.1. SI arr[i] ES IGUAL A x ENTONCES
        SI arr[i] == x ENTONCES
           RETORNAR i
        FIN SI
   FIN PARA
2. RETORNAR -1
 */
    public static int busquedaSecuencial(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
/**
 * 
 * @param arr
 * @param x Un arreglo ordenado de enteros arr[] de tamaño n, y un entero x que representa el valor a buscar
 * @return El índice del valor x en el arreglo arr[], o -1 si x no se encuentra en el arreglo
 * 
 * 1. PARA i DESDE 0 HASTA n-1 HACER
   1.1. SI arr[i] ES IGUAL A x ENTONCES
        SI arr[i] == x ENTONCES
           RETORNAR i
        FIN SI

   1.2. SI arr[i] ES MAYOR QUE x ENTONCES
        SI arr[i] > x ENTONCES
           RETORNAR -1
        FIN SI
   FIN PARA

2. RETORNAR -1
 */
    public static int busquedaSecuencialOrdenada(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
            if (arr[i] > x) {
                return -1;
            }
        }
        return -1;
    }
}
