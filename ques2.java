import java.util.Scanner;

/**
 * Write a description of class ques2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques2{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your grade");
        int grade= sc.nextInt();
        
        //Ternary operator
        String result= (grade>=40)?"Pass":"Fail";
        
        //Uaing escape sequences
        System.out.println("Your result is :\n\t"+ result);
        
    }

}