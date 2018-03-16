
import java.util.Scanner;  

public class ScannerGame {
public static void main(String []args) {
	
	//Grid area = new Grid();
	//area.gridx();
	
	System.out.println();
	System.out.println("Press ENTER twice on your keyboard to continue!!");
	System.out.println("Press Enter Twice After each question is entered");

    Scanner rep = new Scanner(System.in);  
    String name;                             
    String game1, game2, game3; 
    String input = rep.nextLine();
    int age;
    
   
         
    System.out.println("Please enter your age.");
    age = rep.nextInt();

    if (age>13) {

        
        System.out.println("Hello. Please Enter your Name :");
        }else {
            System.out.println("You are not old enough to play! Sorry!.");
            System.exit(0);
        }

    name=rep.next(); 


    System.out.print("so "+ " "+name+ " Are you Ready!");
    System.out.print("Lets Play!");
    System.out.print("Magic compass tells the player how far away the next feature of interests are");
    System.out.println("The player can go north, south, east and west, watch out for the grey floggy couds and plants popping up, type any key to continue");
    System.out.println("What is the aim of the game? Your Aim is to find Treasure");
    System.out.println("press any key to conitue!!");
  
    
    
    System.out.println("");
    System.out.println("Choose direction, from (north, south, east, west)");
    input = rep.next();

 if (input.equals("north")) {
	 System.out.println(".......Great choice, Move on");
    	
    }  else if (input.equals("south")) {
        System.out.println("Please restart to play");
        System.exit(0);
    }

 else if (input.equals("west")) {
    System.out.println("Please restart to play");
    System.exit(0);
}


  else if (input.equals("east")) {
    System.out.println("Please restart to play");
    System.exit(0);
}

 
 game1=rep.next(); 


 
 
 System.out.println("");
 System.out.println("which direction do you want to go next (north, south, east, west)");
 input = rep.next();

if (input.equals("north")) {
	 System.out.println("......Excellent!!");
 	
 }  else if (input.equals("south")) {
     System.out.println("Please restart to play");
     System.exit(0);
 }

else if (input.equals("west")) {
 System.out.println("Please restart to play");
 System.exit(0);
}


else if (input.equals("east")) {
 System.out.println("Please restart to play");
 System.exit(0);
}


game1=rep.next(); 

}







}