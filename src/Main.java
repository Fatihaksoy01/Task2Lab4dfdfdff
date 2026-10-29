
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Corolla", "Toyota", 2022,
                25000, "White", 10);

        System.out.println("Original car information:");
        System.out.println(car.toString());

        car.sell();

        System.out.println("\nCar information after selling:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());



        car.setModel("Camry");
        car.setPrice(30000);
        car.setColor("Black");

        System.out.println("\nUpdated car information:");
        System.out.println(car.toString());
    }
}
