import java.util.Scanner;
public class BeachCode {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("I want to surf, where should we go surfing?");
        String[] surfList = {
            "Pipeline",
            "The Wedge",
            "15th Street",
            "11th Street",
            "Tamarack",
            "North Blacks",
            "South Blacks",
            "G-Land", 
            "La Jolla Shores",
            "Upper Tresles",
            "Lower Tresles", 
            "Jaws"
        };    
        String[] chosenSpots = new String[5];  
        int surfSpotNew;
        for (int i = 0; i<5; i++){

            surfSpotNew = (int)(Math.random()*surfList.length)+0; 
            while(surfList[surfSpotNew].equals("")){
                surfSpotNew = (int)(Math.random()*surfList.length)+0;
            }
            chosenSpots[i]= surfList[surfSpotNew];
            surfList[surfSpotNew] = "";
        }
        System.out.println("The surf today is looking good in ");
        for(String s : chosenSpots){System.out.print(s+", ");}
        System.out.println();
        
        while(true){
            String surfSpot = scan.nextLine();
            if(surfSpot.equals(chosenSpots[0])){
                break;
            }
            else if(surfSpot.equals(chosenSpots[1])){
                    break;
            }
            else if(surfSpot.equals(chosenSpots[2])){
                    break;
            }
            else if(surfSpot.equals(chosenSpots[3])){
                    break;
            }
            else if(surfSpot.equals(chosenSpots[4])){
                    break;
            }
            else{
                System.out.println("That spots not looking so hot today lets pick something else?");
            }    
        }   
        System.out.println(surfSpot + " seems like fun ");
    scan.close(); 
        
    }
}
