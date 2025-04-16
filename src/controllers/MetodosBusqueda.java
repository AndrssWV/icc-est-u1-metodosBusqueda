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
        showPersonByName();
    }

    //public int busquedaLineal(int[] arreglo, int busqueda) {
    //    for(int i = 0; i < arreglo.length; i++) if (arreglo[i] == busqueda) return i;
    //    return -1;
    //}

    public int findPersonByCode(int code) {
       for (int i = 0; i < people.length; i++) if (this.people[i].getCode()==code) return i;
       return -1;
    }

    public int findPersonByName(String name) {
        for (int i = 0; i < people.length; i++) if (this.people[i].getName().equalsIgnoreCase(name)) return i;
        return -1;
     }

    public void showPerson() {
       int code = showConsole.inputCode();
       int i = findPersonByCode(code);
       if (i>-1) {
           showConsole.showMessage("Person with code '" + code + "' find out");
           showConsole.showMessage(people[i].toString());
       } else showConsole.showMessage("(Not Found)");
    }

    public void showPersonByName() {
        String name = showConsole.inputName();
        int i = findPersonByName(name);
        if (i>-1) {
            showConsole.showMessage("Person with name '" + name + "' find out");
            showConsole.showMessage(people[i].toString());
        } else showConsole.showMessage("(Not Found)");
     }
}
