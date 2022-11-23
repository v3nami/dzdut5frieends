import java.util.Scanner;
public class dutty {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int sum = scann.nextInt();
        int mans = scann.nextInt();

        if (sum <= 0){
            System.out.println("Bill total amount cannot be negative");
        }else if (mans<=0){
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            int oneSum = sum / mans;
            System.out.println(oneSum+(oneSum/100 * 10));
        }
        scann.close();

    }

}