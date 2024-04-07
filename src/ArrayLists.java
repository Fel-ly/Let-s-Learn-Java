//ArrayLists are resizable arrays and store reference datatypes.


import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> prime = new ArrayList<Integer>();

        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);

        prime.set(0, 11); //sets element at index 0 to 11
        prime.remove(3); //removes element at index 3
        prime.addLast(13); //adds a last element 13
        prime.clear(); //clears the list


        for (int i=0; i<prime.size(); i++){
            System.out.print(prime.get(i) + ", ");
        }

    }
}
