import java.util.Scanner;
public class Project1_Mohammad_Dawud
{
      public static void main (String[] args)
      {
          Scanner keyboard = new Scanner(System.in);
          
          System.out.print("Please enter the Policy Number: ");
          int policyNumber = keyboard.nextInt();
           keyboard.nextLine();
          
           System.out.print("Please enter the Provider Name: ");
           String providerName = keyboard.nextLine();

           System.out.print("Please enter the Policyholder’s First Name: ");
           String firstName = keyboard.nextLine();

           System.out.print("Please enter the Policyholder’s Last Name: ");
           String lastName = keyboard.nextLine();

           System.out.print("Please enter the Policyholder’s Age: ");
           int age = keyboard.nextInt();
           keyboard.nextLine();
           
           System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
           String smokingStatus = keyboard.nextLine();

           System.out.print("Please enter the Policyholder’s Height (in inches): ");
           double height = keyboard.nextDouble();

           System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
           double weight = keyboard.nextDouble();
          
          
           Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height,
               weight);

           policy.displayPolicyDetails();      
      
      }
}