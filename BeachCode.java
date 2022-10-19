import java.util.Scanner;
public class BeachCode {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Its the fabeled summer break and you realize there is only one thing to do with your time \nSURF!! \nSo where should you go surfing?");
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
        System.out.println("You check your phone for the best spots of the day\n-----------------------------------\nThe surf today is looking good in ");
        for(String s : chosenSpots){System.out.print(s+",\n ");}
        System.out.println("-----------------------------------");
        System.out.println("Which spot you going to conquer today?");
        boolean flag = false;
        String surfSpot = "";
        while(flag==false){
            surfSpot = scan.nextLine(); 
            for(int i = 0;i<5;i++){
                if(surfSpot.equals(chosenSpots[i])){
                flag = true;
                }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println(surfSpot + " seems like fun, the waves there are barreling like crazy!!");
        System.out.println("With the batlefield "+ surfSpot + "chosen, you now need your weapon of choice.\n");
        scan.close(); 
        
    }
}
