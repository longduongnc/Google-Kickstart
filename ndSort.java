import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ndSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int numCase=0;

        numCase = input.nextInt();

        for(int x=0; x < numCase; x++){
            arr.clear();
            int num = input.nextInt();

            for(int y =0; y<num; y++){
                arr.add(input.nextInt());
            }
            Collections.sort(arr);
            System.out.print("Case #"+(x+1)+": ");
            for(int z=0;z<arr.size();z++){
                System.out.print(arr.get(z)+" ");
            }
        }


    }
}