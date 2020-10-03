// public keyword is an access modifier
// describing what access we want others to have
// to the class we are creating.
// public means unrestricted access to the class
public class Car {

    // Variables created inside a class, not method, are
    // known as fields or states.
    // These are set to private with the access keyword private
    // so that they cannot be accessed outside of the class
    // doing so allows us to adhere to the OOP fundamental
    // concept of encapsulation.
    // these variables are actually the state components
    // or properties for a Car or whatever class you are
    // implementing, these are the characteristics for the class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Any method created for this class is attached to be used
    // by all objects of this class
    public void setModel (String model) {

        // Allows for validation to be performed on what
        // is set instead of just allowing it to happen
        String validModel = model.toLowerCase();
        if (validModel.equals("wrangler") || validModel.equals("spider")) {

            // Typing the keyword this before the definition
            //refers to the field for that class not the
            //parameter being passed in
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }//end of method setModel

    public String getModel () {

        return this.model;

    }//end of method getModel

}//end of class Car
