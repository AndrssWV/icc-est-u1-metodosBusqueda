package views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {System.out.println("*** Metodos de Busqueda ***");}

    public void showMessage(String message) {System.out.println(message);}

    public int inputCode() {
        System.out.print("Enter the code: ");
        return scanner.nextInt();
    }
    
    public String inputName() {
        System.out.print("Enter the name: ");
        return scanner.next();
    }
}
