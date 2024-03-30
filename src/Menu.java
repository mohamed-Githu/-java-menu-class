/**
 * Class Menu provides the following functionalities:
 * - addOption
 * - display
 */
public class Menu {
    private String menuText;
    private int optionsCount;

    /**
     * Menu constructor with no options.
     */
    public Menu() {
        this.optionsCount = 1;
    }

    /**
     * Menu constructor with an initial option.
     * @param option the initial option that will be added as a first option in the menu.
     */
    public Menu(String option) {
        menuText = "1) " + option + "\n";
        optionsCount = 2;
    }

    /**
     * Add a new option to the menu
     * @param option the option that will be added to the menu as a last option
     */
    public void addOption(String option) {
        menuText += optionsCount + ") " + option + "\n";
        optionsCount++;
    }

    /**
     * Displays/prints the menu of options
     */
    public void display() {
        System.out.print(menuText);
    }
}
