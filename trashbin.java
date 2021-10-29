import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCase = input.nextInt();
        int dis = 10000000, total = 0;

        for (int x = 0; x < numCase; x++) {
            int house = input.nextInt();
            input.nextLine();
            String s = input.nextLine();

            for (int y = 0; y < house; y++) {
                dis =10000000;
                if (s.charAt(y) == '1') {
                    continue;
                } else {
                    for (int z = 0; z < house; z++) {
                        
                        if (s.charAt(z) == '1') {
                            dis = Math.min(Math.abs(y - z), dis);
                        } else {
                            continue;
                        }
                    }
                    total += dis;
                }
            }

            System.out.println("Case #" + (x + 1) + ": " + total);
        }
    }
}
