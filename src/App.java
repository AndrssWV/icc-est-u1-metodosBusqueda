public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {5, 12, 7, 19, 3, 25, 8, 14, 6, 10};
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int i = metodosBusqueda.busquedaLineal(arreglo, 2);
        System.out.println(i!=-1? arreglo[i] : "(No encontrado)");
        int j = metodosBusqueda.busquedaLineal(arreglo, 14);
        System.out.println(j!=-1? arreglo[j] : "(No encontrado)");
    }
}
