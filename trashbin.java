import java.util.ArrayList;
import java.util.Scanner;

public class trashbin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int testCase = input.nextInt();

        for (int x = 0; x<testCase; x++){
            
            int house = input.nextInt();
            String trashPos = input.nextLine();

            for (int y=0; y < trashPos.length(); y++){
                arr.add(Character.getNumericValue(trashPos.charAt(y)));
            }

            System.out.println("Case #"+(x+1)+": "+distance(house, arr));

        }
    }

    public static int distance(int house, ArrayList<Integer> arr){
        ArrayList<Integer> trashPla = new ArrayList<Integer>();
        int total = 0 ;
        
        for(int x =0; x< arr.size(); x++){
            if (arr.get(x)==1){
                trashPla.add(x);
            }
            else{
                continue;
            }
        }

        for(int y=0; y<house; y++){
            
            if (arr.get(y)==1){
                continue;
            }
            
            else{
                
                for(int z=0; z<trashPla.size()-1; z++){
                    
                    if (y<trashPla.get(0)){
                        total += trashPla.get(0) -y ;
                    }
                    else if (y>trashPla.get(z)&&y<trashPla.get(z+1)){
                        int ShortestDis = Math.min(Math.abs(y-trashPla.get(z)), Math.abs(trashPla.get(z+1)-y));
                        total += ShortestDis;
                    }
                    else{
                        total +=  y - trashPla.get(trashPla.size()-1);
                    }
                
                }
            }
        }
        
        return Math.abs(total);
    }
}
