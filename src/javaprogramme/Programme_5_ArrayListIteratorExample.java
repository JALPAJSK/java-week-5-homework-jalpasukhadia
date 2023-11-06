package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_ArrayListIteratorExample {

        public static void main(String[] args) {
            // Create an ArrayList to store elements
            ArrayList<String> names = new ArrayList<>();

            // Add some elements to the ArrayList
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");

            // Create an Iterator to iterate through the elements
            Iterator<String> iterator = names.iterator();

            // Iterate and print each element using the Iterator
            System.out.println("Elements in the ArrayList:");
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }
        }
    }


