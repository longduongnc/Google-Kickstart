import java.util.ArrayList;
import java.util.Scanner;

public class dogandcat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();

        for (int x=0; x<T; x++){

            ArrayList<String> arr = new ArrayList<String>();
            int N = input.nextInt();
            int D = input.nextInt();
            int C = input.nextInt();
            int M = input.nextInt();
            input.nextLine();
            String S = input.nextLine();

            arr.add(dogsgotfed(N,D,C,M,S));

            System.out.print("Case #"+(x+1)+":");
            
            for (int y = 0; y < T; y++){
                System.out.print(" "+arr.get(y));
            }
            System.out.println("");
        }
    }

    public static String dogsgotfed(int N, int D, int C, int M, String S){
        ArrayList<Character> arrOfChar = new ArrayList<Character>();
        for(int x=0; x<S.length(); x++){
            arrOfChar.add(S.charAt(x));
        }

        for (int y=0; y<arrOfChar.size(); y++){
            
            boolean allCat;
            int Cat = 0, Dog = 0;
            
            for(int z=0; z<arrOfChar.size(); z++){
                if (arrOfChar.get(z).equals('C')){
                    Cat++;
                }
                else{
                    Dog++;
                }
            }
            
            if (Dog==0){
                allCat = true;
            }
            else{
                allCat = false;
            }
            
            if(allCat == true ){
                return "YES";
            }
            else if (arrOfChar.get(y).equals('C')){
                C--;
                if(C==0&&D>0){
                    return "NO";
                }
            }
            else{
                D--;
                C += M;
            }
        }
        return "YES";
    }
}