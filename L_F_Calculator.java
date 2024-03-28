import java.util.Scanner;
public class L_F_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();
        
        double fine = calculateFine(daysLate);
        
        if (fine == -1) {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
        } else {
            System.out.println("Fine: " + fine + " rupees");
        }
    }
    
    public static double calculateFine(int daysLate) {
        if (daysLate <= 7) {
            return 0.5 * daysLate;
        } else if (daysLate <= 14) {
            return 0.5 * 7 + (daysLate - 7);
        } else if (daysLate <= 21) {
            return 0.5 * 7 + 1 * 7 + (daysLate - 14);
        } else {
            // Membership canceled if returned after 21 days
            return -1;
        }
    }
}
