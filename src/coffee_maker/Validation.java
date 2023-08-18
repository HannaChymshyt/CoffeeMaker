package coffee_maker;

public class Validation {

    static CoffeeMachine coffeeMachine = new CoffeeMachine();
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

    static void getOutput() {
        String coffee = coffeeMachine.makeCoffee();
        System.out.println("\nYour " + coffee + ". Enjoy");
    }

}
