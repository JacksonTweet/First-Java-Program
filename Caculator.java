//packaging stuff
package Calculator;

//importing stuff
import java.util.Scanner;  
 
class Caculator  
 {  
  public static void main(String args[])  
   {
    //Start commands
    String error = 'Error! Command not found! type help for cammands or check the wiki';
    String test = 'test dis';  
    String help = 'help';  
    
    //input sections
    String input;  
    String output;
    
    //input numbers
    int A;
    int B;
    int C;
    int D;
    
    //basic methods
    double add;
    double sub;
    double times;
    
    //formula;
    double area;
    double lengthtimeshight;
    
    //start input area
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter a command: (Dont know the commands? Type 'help' Or go to goo.gl/7baiQK)");  
    input = in.nextLine();  
    
    if (input = help) {
        output = 'help';
    } else if (input = test) {
        output = 'test';
    } else {
        output = 'error';
    }
        
    System.out.println(""+output);
  }  
 }  
