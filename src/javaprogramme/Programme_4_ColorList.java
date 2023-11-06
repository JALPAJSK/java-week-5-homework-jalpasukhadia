package javaprogramme;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColorList {

        public static void main(String[] args) {
            // Create a new ArrayList to store colors
            ArrayList<String> colors = new ArrayList<>();

            // Add some colors to the ArrayList
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Orange");

            // Print the collection using a for-each loop
            System.out.println("List of Colors:");
            for (String color : colors) {
                System.out.println(color);
            }
        }
}


