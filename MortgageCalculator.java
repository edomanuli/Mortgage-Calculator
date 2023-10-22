import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;


        Scanner principalInput = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = principalInput.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = principalInput.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS;

        
        System.out.print("Period (Years): ");
        int years = principalInput.nextInt();
        int numberOfPayments = years * MONTHS;

        
        
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / 
        (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



        principalInput.close();
    }
}