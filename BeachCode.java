import java.util.Scanner;
public class BeachCode {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("I want to surf, where should we go surfing?");
        String surfSpot;
        while(true) {
            surfSpot = scan.nextLine();
            if (surfSpot.equals("Pipeline")||surfSpot.equals("The Wedge")){
                System.out.println("OOOOOOOHHHHHH, " + surfSpot + " sounds so much fun ");
                break;
            }else{
                System.out.println("Bruh, that spot isnt looking so hot, can you think of anything else?");
            }
        
        }
        if(surfSpot.equals("Pipeline") || surfSpot.equals("The Wedge") ){
            int lowSize = (int)Math.random()*5+2;
            int highSize = (int)Math.random()*4+7;
            String waveSize = (lowSize + " to "+highSize);
            System.out.println("Sine we are going to " + surfSpot + ", and the waves are going to be " + waveSize + "\nWhat size board should we ride?");        
            String board = scan.nextLine();
        }
       
 
 
 
        scan.close();
    }
}
