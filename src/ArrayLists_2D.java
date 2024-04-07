package src;

import java.util.ArrayList;

public class ArrayLists_2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> StudentInfo = new ArrayList<>();  // 2D array list that contains all the separate arrayLists

        ArrayList<String> SubjectsList  = new ArrayList<>();
        SubjectsList.add("Mathematics");
        SubjectsList.add("English");
        SubjectsList.add("Science");
        SubjectsList.add("Geography");

        ArrayList<String> MealsList  = new ArrayList<>();
        MealsList.add("Rice");
        MealsList.add("Pizza");
        MealsList.add("Ugali");

        ArrayList<String> HobbyList  = new ArrayList<>();
        HobbyList.add("Reading");
        HobbyList.add("Movies");


        // Add the lists to the 2D arrayList
        StudentInfo.add(SubjectsList);
        StudentInfo.add(MealsList);
        StudentInfo.add(HobbyList);

        System.out.println(StudentInfo.get(2).get(1)); // prints the value in the index 1 position, in the list at index 2
    }

}
