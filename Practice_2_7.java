/*prompt user for input of 
veloicty and acceleration. And 
then finding minimum runway length
*/
   //importing a scanner
   import java.util.Scanner;

//Name of the Class
public class Practice_2_7 {

   //Main Method
   public static void main(String[] args) {
   
      //creating a new scanner
      Scanner input = new Scanner(System.in);
      
      //Finding min-runway length
      
      //prompting the user to enter the velocity
      System.out.println("Enter the veloicty: ");
      
      //taking input from a user of starting velocity
      double vel = input.nextDouble();
      
      //prompting the user to enter the acceleration
      System.out.println("Enter the acceleration: ");
      
      //taking input from a user of acceleration
      double accel = input.nextDouble();
      
      //calculatiog the min runway length
      double runway_length = Math.pow (vel, 2)/(2*(accel));
      
      //displaying the min runway length
      System.out.println("Minimum Runway Length: " + runway_length);  
      
   }//end of main block
   
}//End of Practice_2_7   