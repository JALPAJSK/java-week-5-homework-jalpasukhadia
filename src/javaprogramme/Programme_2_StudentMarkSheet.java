package javaprogramme;

import java.util.Scanner;

/**
 *   Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 and 100 and if it is
 *   out of range print error message “Invalid Input, Marks should between 0 and 100”) and find out total, percentage and result.
 *   If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And
 *   using if else and while loop.
 *   print Mark Sheet in following format.
 *       _________________________________
 *       |                               |
 *       |           Mark Sheet          |
 *       |_______________________________|
 *       |    Name        : Jay          |
 *       |    Roll No     : 08           |
 *       |_______________________________|
 *       |    Subjects    : Marks        |
 *       |_______________________________|
 *       |    Math        : 98           |
 *       |    Science     : 90           |
 *       |    English     : 85           |
 *       |_______________________________|
 *       |    Total       : 273          |
 *       |_______________________________|
 *       |    Percentage  : 91.0         |
 *       |    Result      : Pass         |
 *       |    Grade       : A+           |
 *       |_______________________________|
 */
public class Programme_2_StudentMarkSheet {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char continueInput = 'Y';

            while (continueInput == 'Y' || continueInput == 'y') {
                System.out.print("Enter the student's name: ");
                String name = scanner.next();
                System.out.print("Enter the student's roll number: ");
                int rollNumber = scanner.nextInt();

                System.out.print("Enter the marks for Math (0-100): ");
                int mathMarks = scanner.nextInt();
                System.out.print("Enter the marks for Science (0-100): ");
                int scienceMarks = scanner.nextInt();
                System.out.print("Enter the marks for English (0-100): ");
                int englishMarks = scanner.nextInt();

                if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
                    System.out.println("Invalid Input, Marks should be between 0 and 100");
                } else {
                    int totalMarks = mathMarks + scienceMarks + englishMarks;
                    double percentage = (totalMarks / 300.0) * 100;
                    String result = (percentage >= 35) ? "Pass" : "Fail";
                    String grade = "";

                    if (percentage >= 80) {
                        grade = "A+";
                    } else if (percentage >= 60) {
                        grade = "A";
                    } else if (percentage >= 50) {
                        grade = "B";
                    } else if (percentage >= 35) {
                        grade = "C";
                    }

                    System.out.println("_______________________________");
                    System.out.println("|                           |");
                    System.out.println("|         Mark Sheet        |");
                    System.out.println("|____________________________|");
                    System.out.println("|    Name        : " + name);
                    System.out.println("|    Roll No     : " + rollNumber);
                    System.out.println("|____________________________|");
                    System.out.println("|    Subjects    : Marks    |");
                    System.out.println("|____________________________|");
                    System.out.println("|    Math        : " + mathMarks);
                    System.out.println("|    Science     : " + scienceMarks);
                    System.out.println("|    English     : " + englishMarks);
                    System.out.println("|____________________________|");
                    System.out.println("|    Total       : " + totalMarks);
                    System.out.println("|____________________________|");
                    System.out.println("|    Percentage  : " + percentage);
                    System.out.println("|    Result      : " + result);
                    if (!grade.isEmpty()) {
                        System.out.println("|    Grade       : " + grade);
                    }
                    System.out.println("|____________________________|");
                }

                System.out.print("Would you like to do more calculations? (Y/N): ");
                continueInput = scanner.next().charAt(0);
            }

            scanner.close();
        }
}




