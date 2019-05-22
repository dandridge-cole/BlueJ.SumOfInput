/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public void main(){
        System.out.print("Gauss is turning over in his grave: "+calculateSum(promptForInput()));
    }
    
    public Integer promptForInput(){
        Integer userInput;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer:");
        userInput = myScanner.nextInt();
        return userInput;
    }
    
    public Integer calculateSum(Integer input){
        Integer mySum=0;
        for(Integer i = 1; i<=input;i++){
            mySum+=i;
        }
        return mySum;
    }
    
}
