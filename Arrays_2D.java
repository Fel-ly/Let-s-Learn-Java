public class Arrays_2D {
    public static void main(String[] args) {

        String[][] food = {
                {"Rice", "Ugali", "Githeri", "Spaghetti"},
                {"Beef", "Pork", "Chicken", "Fish"},
                {"Crisps", "Ringoz", "WowWow", "Biscuits"},
                {"Juice", "Coffee", "Tea", "Water"}
        };

        for (int i=0; i<food.length; i++){
            System.out.println();
            for (int j=0; j<food[i].length; j++){
                System.out.print(food[i][j] + " ");
            }
        }

        System.out.println(); // This is just to separate the results of the two ways (one above, the other below) of writing the code

        // can also be written as:
        String[][] Food  = new String[4][4];

        // first row
        Food[0][0] = "Rice";
        Food[0][1] = "Ugali";
        Food[0][2] = "Githeri";
        Food[0][3] = "Spaghetti";
        //second row
        Food[1][0] = "Beef";
        Food[1][1] = "Pork";
        Food[1][2] = "Chicken";
        Food[1][3] = "Fish";
        //third row
        Food[2][0] = "Crisps";
        Food[2][1] = "Ringoz";
        Food[2][2] = "WowWow";
        Food[2][3] = "Biscuits";
        //fourth row
        Food[3][0] = "Juice";
        Food[3][1] = "Coffee";
        Food[3][2] = "Tea";
        Food[3][3] = "Water";

        for (int i=0; i<Food.length; i++){
            System.out.println();
            for (int j=0; j< Food[i].length; j++){
                System.out.print(Food[i][j] + " ");
            }
        }


    }
}
