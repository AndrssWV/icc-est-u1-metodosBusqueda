package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] people){
        showConsole = new ShowConsole();
        this.people = people;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int busqueda) {
        for(int i = 0; i < arreglo.length; i++) if (arreglo[i] == busqueda) return i;
        return -1;
    }

    public int busquedaLinealRecursiva(int[] arreglo, int busqueda, int i) {
        if (i==arreglo.length) return -1;
        if (arreglo[i] == busqueda) return i;
        return busquedaLinealRecursiva(arreglo, busqueda, i+1);
    }

    /**
     * @param code a buscar
     * @return pocision de la persona encontrada
     */

     public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) if (this.people[i].getCode()==code) return i;
        return -1;
     }

     public void showPerson() {
        int code = showConsole.inputCode();
        int i = findPersonByCode(code);
        if (i>-1) {
            showConsole.showMessage("Person with code" + code + " find out");
            showConsole.showMessage(people[i].toString());
        } else showConsole.showMessage("(Not Found)");
     }
}
