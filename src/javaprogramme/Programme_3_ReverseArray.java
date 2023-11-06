package javaprogramme;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};

            System.out.println("Original Array:");
            printArray(originalArray);

            int[] reversedArray = reverseArray(originalArray);

            System.out.println("\nReversed Array:");
            printArray(reversedArray);
        }

        public static int[] reverseArray(int[] arr) {
            int length = arr.length;
            int[] reversedArray = new int[length];

            for (int i = 0; i < length; i++) {
                reversedArray[i] = arr[length - 1 - i];
            }

            return reversedArray;
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}


