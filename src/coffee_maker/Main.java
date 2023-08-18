package coffee_maker;


import java.util.Scanner;

public class Main {
    static CoffeeMachine coffeeMachine;
    static int userChoice;

    public static void main(String[] args) {

        coffeeMachine = new CoffeeMachine();
        promptForUserChoice();
        userChoice = getUserChoice();

    }

    static void promptForUserChoice() {
        System.out.print("Choose a drink:" +
                "\n1 - Espresso" +
                "\n2 - Cappuccino" +
                "\n3 - Latte\n");
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

}
