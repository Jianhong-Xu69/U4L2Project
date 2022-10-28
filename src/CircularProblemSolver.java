import java.util.Scanner;
public class CircularProblemSolver {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Welcome to the Circular Problem Solver!\nHow many numbers are in the circle? (n): ");
        int n = user.nextInt();
        int s = n;
        int count = 1;
        while (n > count)
        {
            count = count * 2 + 1;
        }
        s = count - (2 * (count - n));
        System.out.println("The last number remaining is " + s);
    }
}