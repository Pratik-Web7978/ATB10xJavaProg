package ex_31122024;

public class Lab004 {
    public static void main(String[] args){


                int n = 10; // Number of terms to display
                int first = 0, second = 1; // Starting values of the Fibonacci series

                System.out.println("Fibonacci Series up to " + n + " terms:");
                System.out.print(first + ", " + second); // Printing the first two terms

                for (int i = 3; i <= n; i++) { // Loop starts from the 3rd term
                    int next = first + second; // Calculate the next term
                    System.out.print(", " + next); // Print the next term
                    first = second; // Update first to the previous second
                    second = next; // Update second to the current next
                }

                System.out.println(); // Move to the next line after the series
            }
        }



