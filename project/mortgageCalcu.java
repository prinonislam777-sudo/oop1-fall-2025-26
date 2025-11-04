
import java.util.Scanner;

public class mortgageCalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        
        System.out.println("== Bangladesh Mortgage Calculator (BDT) ==");
        
        // Get user input
        System.out.print("Enter loan amount (Principal in BDT): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();
        
    
        double monthlyInterestRate = annualInterestRate /12;
        int numberOfPayments = years * 12;
        
    
        double monthlyPayment = principal * 
            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / 
            (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        
    
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;
        
    
    }
}