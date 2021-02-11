/*

Algorithm for calculator 

declare variables 1st digit, 2nd digit ,result and operator  
read inputs for 1st and 2nd digits
read input for operator 

     if operator == + 
          result = add 1st and 2nd digit 

     
     if operator == -
          result subtract 1st and 2nd digit 
     
     
     if operator == + 
          result = multiply 1st and 2nd digit 

     
     if operator == + 
          result =divide 1st and 2nd digit 

     if operator != any of the above 
          result = print "enter right operator "

print result 
     
*/


//Java code for clculator using switch cases 
package Phase1;

public class Calculator{
    public static void main (String[] args){
     
        double result;
        double firstDigit=Double.parseDouble(args[0]);
       double secondDigit=Double.parseDouble(args[2]);
         
         switch (args[1]){
             case "+" :
                 result=firstDigit+secondDigit;
                 break;
            
            case "-" :
                 result=firstDigit-secondDigit;
                 break;
            case "*" :
                 result=firstDigit*secondDigit;
                 break;
            case "/" :
                 result=firstDigit/secondDigit;
                 break;
             case "%" :
                 result=firstDigit%secondDigit;
                 break;    
            default :
            System.out.println("Please enter operators +,-,*,/,% only");
            return;
         }
         
         System.out.println(firstDigit+ " "+args[1]+" "+secondDigit+ " = "+result);
        
    
    }
}