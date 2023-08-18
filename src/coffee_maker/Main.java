package coffee_maker;


import java.util.Scanner;

public class Main {
    static CoffeeMachine coffeeMachine;
    static int userChoice;

    public static void main(String[] args) {

        coffeeMachine = new CoffeeMachine();
        promptForUserChoice();
        userChoice = getUserChoice();
        getResult(userChoice);

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

    static void getOutput() {
        String coffee = coffeeMachine.makeCoffee();
        System.out.println("\nYour " + coffee + ". Enjoy");
    }

    static void getResult(int choice) {

        if (choice >= 1 && choice <= 3) {

            switch (choice) {
                case 1 -> {
                    coffeeMachine.setCoffeeType(new Espresso());
                    getOutput();
                }
                case 2 -> {
                    coffeeMachine.setCoffeeType(new Cappuccino());
                    getOutput();
                }
                case 3 -> {
                    coffeeMachine.setCoffeeType(new Latte());
                    getOutput();
                }

            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
