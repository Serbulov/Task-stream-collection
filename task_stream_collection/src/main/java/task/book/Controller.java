package task.book;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private View view;
    private Management management;
    private IO io;

    public Controller() { this.view = new View();}

    public void userInteraction(Scanner scanner) {
        management = new Management();
        io = new IO();

        int m;
        while ((m = view.menu()) != 0) {
            switch (m) {
                case 1: management.addNewBook(); break;
                case 2: management.showAllBook(); break;
                case 3: view.printMethodNotImplemented(); break;
                case 4: management.deleteBook(); break;

                case 5: management.saveListToFile(); break;
                case 6: management.readFile(); break;

                case 7: management.sortedA(); break;
                case 8: management.sortedB(); break;
                case 9: management.sortedC(); break;
                case 10: management.sortedD(); break;
                case 11: management.sortedE(); break;
                case 12: management.sortedF(); break;
            }
        }
    }
}
