public class MetodosBusqueda {
    public int busquedaLineal(int[] arreglo, int busqueda) {
        for(int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busqueda) {
                return i;
            }
        }
        return -1;
    }
}
