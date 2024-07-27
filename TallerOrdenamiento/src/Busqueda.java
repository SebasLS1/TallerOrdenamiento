public class Busqueda {

    public static int busquedaSecuencial(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

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
