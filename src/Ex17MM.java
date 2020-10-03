public class Ex17MM {
    public static void main(String[] args) {

        // Local variable since we are in a method
        // Car is a class, but we can treat it like
        // a data type. "jeep" is an object which is of type Car.
        // Saying new Car(); is creating a new
        // instance (new object) of the Car class and initializing
        // it, are initializing it with default values or null values depending on the
        // constructor.
        // We created an object called jeep based on
        // the template Car.  This object has access to
        // all the fields and methods that exist inside the Car class
        // we also have another object called ferrari.
        // These two objects do not share states or methods, they each have their
        // own values for each state, it can be the same, but changing the state of
        // one object will not change the value of another object in this simple class
        Car jeep = new Car();
        Car ferrari = new Car();


        // This will print out null as null is the internal
        // default state for a class and a String
        System.out.println("Jeep object before model is set");
		System.out.println("\tCar model is " + jeep.getModel());

		// The setModel(String) method inside the car class belongs
        // to an object of type car.
        // jeep is an object of type Car therefore it can access and use this
        // method to set its model type for the car.
        // The getModel() method returns to us the model that the specific object
        // was set to.  This jeep object's model is set to Wrangler, when we make
        // another object of type car, it will not have a model unless we give it one.
        jeep.setModel("Wrangler");
        System.out.println("Jeep object after the model is set");
        System.out.println("\tCar model is " + jeep.getModel());

        System.out.println("\nFerrari object before model is set");
        System.out.println("\tCar model is " + ferrari.getModel());
        ferrari.setModel("California");
        System.out.println("Ferrari object being set to a model that is not a \"Spider\"");
        System.out.println("\tCar model is " + ferrari.getModel());
    }
}
