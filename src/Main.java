/**
 * A program that utilizes the class Menu
 */
public class Main {
    /**
     * Program entry point
     * @param args not used
     */
    public static void main(String[] args) {
        Menu menu = new Menu("Java");
        menu.addOption("C++");
        menu.addOption("JavaScript");
        menu.addOption("Python");
        menu.display();
    }
}