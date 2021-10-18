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
        ArrayList<Character> arrOfDog = new ArrayList<Character>();
        ArrayList<Character> arrOfCat = new ArrayList<Character>();
        
        for(int x=0; x<S.length(); x++){
            arrOfChar.add(S.charAt(x));
            if (arrOfChar.get(x).equals('D')){
                arrOfDog.add(arrOfChar.get(x));
            }
            else{
                arrOfCat.add(arrOfChar.get(x));
            }
        }

        for (int y=0; y<arrOfChar.size(); y++){
            if (arrOfChar.get(y).equals('C')){
                C--;
                arrOfCat.remove(0);
                if (C<=0 && arrOfDog.size()>0){
                    return "NO";
                }
                else if (arrOfDog.size()==0){
                    return "YES";
                }
                else{
                    continue;
                }
            }
            else{
                D--;
                C += M;
                arrOfDog.remove(0);
                if(D<=0&&arrOfDog.size()==0){
                    return "YES";
                }
                else if(D<=0 && arrOfDog.size()>0){
                    return "NO";
                }
                else{
                    continue;
                }
            }
        }
    }
}