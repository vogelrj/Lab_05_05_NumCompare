import java.sql.SQLOutput;

public class Lab_05_05_NumCompare {
    public static void main(String[] args){
        //class NumComp
        //	Main()
        //		num firstNum = 0
        //		num secondNum = 0
        //		output “Enter a number “
        //		input firstNum
        //		output “Enter another number “
        //		input secondNum
        //		if firstNum == secondNum then
        //			output “these numbers are equal”
        //		else if firstNum > secondNum then
        //			output “the number” + firstNum “is great than” + secondNum
        //		else
        //			output “the number” + firstNum “is less than” + secondNum”
        //		end if
        //	return
        //end class
        double firstNum = 22.22;
        double secondNum = 11.11;
        System.out.println("Enter a number.");
        System.out.println(firstNum);
        System.out.println("Enter another number.");
        System.out.println(secondNum);
        if (firstNum == secondNum){
            System.out.println("These numbers are equal.");
        } else if (firstNum > secondNum) {
            System.out.println("The number" + firstNum + " is greater than " + secondNum + ".");
        }
        else if (firstNum < secondNum){
            System.out.println("The number " + firstNum + " is less than " + secondNum + ".");
        }
        else{
            System.out.println("Invalid input. Please try again.");
        }
    }
}
