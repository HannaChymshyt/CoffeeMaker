package coffee_maker;

public class CoffeeMachine {

    private CoffeeType coffeeType;

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String makeCoffee() {
        return coffeeType.coffee();
    }

}