import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer repetition=0, x=0;
        double disTance, veLocity;
        
        repetition= input.nextInt();

        while(x<repetition){
            veLocity = input.nextDouble();
            disTance = input.nextDouble();
            double answer =(((Math.asin((disTance*9.8)/(veLocity*veLocity))/2)+(Math.PI/2))*(180/Math.PI))-90;
            System.out.printf("%.8g\n", answer);
            x++;
        }

    }
}