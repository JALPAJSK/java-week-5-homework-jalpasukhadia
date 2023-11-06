package javaprogramme;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapExample {
        public static void main(String[] args) {
            // Create a HashMap to store String keys and Integer values
            HashMap<String, Integer> people = new HashMap<>();

            // Add key-value pairs to the HashMap
            people.put("Alice", 25);
            people.put("Bob", 30);
            people.put("Charlie", 22);
            people.put("David", 28);

            // Iterate through the values in the HashMap using a for-each loop
            System.out.println("Values in the HashMap:");
            for (Integer age : people.values()) {
                System.out.println("Age: " + age);
            }
        }
}


