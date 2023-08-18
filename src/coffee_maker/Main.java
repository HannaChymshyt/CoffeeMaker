package coffee_maker;


import java.util.Scanner;

public class Main {
    static Validation validation;
    static int userChoice;

    public static void main(String[] args) {

        validation = new Validation();
        promptForUserChoice();
        userChoice = getUserChoice();
        validation.getResult(userChoice);

    }

    static void promptForUserChoice() {
        System.out.print("Choose a drink:" +
                "\n1 - Espresso" +
                "\n2 - Cappuccino" +
                "\n3 - Latte\n");
    }

    static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

}
