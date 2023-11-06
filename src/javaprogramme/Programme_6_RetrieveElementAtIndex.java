package javaprogramme;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveElementAtIndex {

        public static void main(String[] args) {
            // Create an ArrayList to store elements
            ArrayList<String> fruits = new ArrayList<>();

            // Add some elements to the ArrayList
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            fruits.add("Date");
            fruits.add("Fig");

            // Specify the index to retrieve an element
            int indexToRetrieve = 2; // Index 2 corresponds to "Cherry"

            // Check if the index is within the bounds of the ArrayList
            if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
                // Retrieve and print the element at the specified index
                String element = fruits.get(indexToRetrieve);
                System.out.println("Element at index " + indexToRetrieve + " is: " + element);
            } else {
                System.out.println("Index is out of bounds.");
            }
        }
}


