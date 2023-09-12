public class Policy
{
      private int PolicyNumber;
      private String ProviderName;
      private String PolicyholdersFirstName;
      private String PolicyholdersLastName;
      private int PolicyholdersAge;
      private String PolicyholdersSmokingStatus;
      private double PolicyholdersHeight;
      private double PolicyholdersWeight;
      
      
      public Policy() 
      {
      
      }

      public Policy(int PNum, String PName, String PFN, String PLN, int PA, String PSS,
       double PH, double PW)
      {
            PolicyNumber = PNum;
            ProviderName = PName;
            PolicyholdersFirstName = PFN;
            PolicyholdersLastName = PLN;
            PolicyholdersAge = PA;
            PolicyholdersSmokingStatus = PSS;
            PolicyholdersHeight = PH;
            PolicyholdersWeight = PW;
            }
            
            
      public void setPolicyNumber( int PNum)
      {
         PolicyNumber = PNum;
         }
         
      public int getPolicyNumber()
      {
            return PolicyNumber;
      }
      
      public void setProviderName(String PName)
      {
            ProviderName = PName;
      }
      
      public String getProviderName()
      {
            return ProviderName;
      }
      
      public void setFirstName(String PFN)
      {
               PolicyholdersFirstName  = PFN;
      }
      
      public String getFirstName()
      {
               return PolicyholdersFirstName;
      }
      
      public void setLastName(String PLN)
      {
               PolicyholdersLastName = PLN;
      }
      
      public String getLastName()
      {
               return PolicyholdersLastName;
      }
      
      public void setPolicyholdersAge(int PA)
      {
               PolicyholdersAge = PA;
      }
      
      public int getPolicyholdersAge()
      {
               return PolicyholdersAge;
      }
      
      public void setPolicyholdersSmokingStatus(String PSS)
      {
               PolicyholdersSmokingStatus = PSS;
      }
      
      public String getPolicyholdersSmokingStatus()
      {
               return PolicyholdersSmokingStatus;
      }
      
      public void setPolicyholdersHeight(double PH)
      {
            PolicyholdersHeight = PH;
      }
      
      public double getHeight()
      {
               return PolicyholdersHeight;
      }
      
      public void setPolicyholdersWeight( double PW)
      {
               PolicyholdersWeight = PW;
      }
      
      public double getWeight()
      {
               return PolicyholdersWeight;
      }  
      
      public double BMI( double Height, double Weight)
      {
            return (Weight * 703) / (Height * Height); 
      } 
      
      public double InsurancePrice() {
        double baseFee = 600;
        double additionalFeeAge = 75;
        double smokingFee = 100;
        double calculatedBMI = BMI(PolicyholdersHeight, PolicyholdersWeight);


        if (calculatedBMI > 35) {
            calculatedBMI = (calculatedBMI - 35) * 20;
        }
        if (PolicyholdersAge > 50) {
            calculatedBMI += additionalFeeAge;
        }
        if ("yes".equalsIgnoreCase(PolicyholdersSmokingStatus)) {
            calculatedBMI += smokingFee;
        }

        return baseFee + calculatedBMI;
            }
            public void displayPolicyDetails() {
            System.out.println("Policy Number: " + PolicyNumber);
            System.out.println("Provider Name: " + ProviderName);
            System.out.println("Policyholder’s First Name: " + PolicyholdersFirstName);
            System.out.println("Policyholder’s Last Name: " + PolicyholdersLastName);
            System.out.println("Policyholder’s Age: " + PolicyholdersAge);
            System.out.println("Policyholder’s Smoking Status: " + PolicyholdersSmokingStatus);
            System.out.println("Policyholder’s Height: " + PolicyholdersHeight + " inches");
            System.out.println("Policyholder’s Weight: " + PolicyholdersWeight + " pounds");
            System.out.println("Policyholder’s BMI: " + BMI(PolicyholdersHeight, PolicyholdersWeight));
            System.out.println("Policy Price: $" + InsurancePrice());            
      }
}
      
            
      