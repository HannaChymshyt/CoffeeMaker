package coffee_maker;


public class Main {
    static CoffeeMachine coffeeMachine;
    static int userChoice;

    public static void main(String[] args) {

        coffeeMachine = new CoffeeMachine();
        promptForUserChoice();

    }

    static void promptForUserChoice() {
        System.out.print("Choose a drink:" +
                "\n1 - Espresso" +
                "\n2 - Cappuccino" +
                "\n3 - Latte\n");
    }

}
