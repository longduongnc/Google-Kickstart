import java.util.Scanner;
import java.util.ArrayList;

public class moist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        boolean loop = true;
        int z=0, swap=0, cost=0;

        int testCase = input.nextInt();

        for(int x=0; x < testCase; x++){
            arr.clear();
            cost = 0;
            int numberCard = input.nextInt();
            input.nextLine();
            
            for(int y=0; y < numberCard; y++){
                String cardName = input.nextLine();
                arr.add(cardName);
            }
                
            while(loop){
                
                while(z<arr.size()-1){
                    swap = 0;
                    if(arr.get(z).compareTo(arr.get(z+1))>0){
                        Swapping(z, z+1, arr);
                        swap++;
                        z++;
                    }
                    else{
                        z++;
                    }
                }
                System.out.println("sawp: "+swap);

                if(swap !=0){
                    cost += swap;
                    System.out.println("hey");
                    z=0;
                }
                else{
                    loop = false;
                        
                }
            }
            
            System.out.println("Case #" +(x+1)+": "+cost);
            System.out.println(arr);
        }


    }

    public static void Swapping(int a, int b, ArrayList<String> arr){
        String swap = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,swap);
        System.out.println(arr.get(a)+" "+arr.get(b));
    } 
}