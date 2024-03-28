import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        System.out.print("Enter the year the employee joined the organization: ");
        int joinYear = scanner.nextInt();
        
        int yearsOfService = currentYear - joinYear;
        
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 15000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }
        
        scanner.close();
    }
}