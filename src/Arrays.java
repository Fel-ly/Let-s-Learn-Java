public class Arrays {
    public static void main(String[] args) {
        //An array of String cars.
        // elements in an array have to be of the same datatype
        String[] cars = {"Atenza","G-Wagon","Bentley","BMW"};
        //                  0          1        2       3
        System.out.println(cars[1]);

        // can also  be written as:
        String[] Cars  = new String[4];

        Cars[0] = "Atenza";  // used 'Cars' with capital C to differentiate with the other variable
        Cars[1] = "G-Wagon";
        Cars[2] = "Bentley";
        Cars[3] = "BMW";

        System.out.println(Cars[2]);

    }
}
