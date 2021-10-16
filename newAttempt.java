import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class newAttempt {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> storedList = new ArrayList<ArrayList<Integer>>();
        Scanner input = new Scanner(System.in);
        int even=1, odd=0;

        int numOfCase = input.nextInt();
        
        for(int x =0; x<numOfCase; x++){
            
            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> oddArr = new ArrayList<Integer>();
            ArrayList<Integer> evenArr = new ArrayList<Integer>();
            int ev = 0, od =0;
            
            int num = input.nextInt();
            
            for(int y=0; y< num; y++ ){
                arr.add(input.nextInt());
            }

            for (int z=0; z < num; z++){
                if (arr.get(z)%2==0){
                    evenArr.add(arr.get(z));
                    arr.set(z, even);
                }
                else{
                    oddArr.add(arr.get(z));
                    arr.set(z, odd);
                }
            }

            Collections.sort(evenArr);
            Collections.reverse(evenArr);
            System.out.println(evenArr);
            Collections.sort(oddArr);
            System.out.println(oddArr);



            for (int i =0; i<num; i++){
                
                if (arr.get(i)==1){
                    arr.set(i, evenArr.get(ev));
                    ev++;
                }
                else{
                    arr.set(i, oddArr.get(od));
                    od++;
                }
            }

            System.out.print("Case #"+(x+1)+":");
            
            for (int j = 0; j < num; j++){
                System.out.print(" "+arr.get(j));
            }
            System.out.println("");
        }
    }
}