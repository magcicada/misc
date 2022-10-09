import java.util.Scanner;

public class new02 {
    public static void main(String[] args){
        System.out.println("Input three numbers: ");
        boolean flag = true;
        while (flag){
            Scanner input01 = new Scanner(System.in);
            Scanner input02 = new Scanner(System.in);
            Scanner input03 = new Scanner(System.in);
            if(input01.hasNextInt() && input02.hasNextInt() && input03.hasNextInt()){
                int set01 = input01.nextInt();
                int set02 = input02.nextInt();
                int set03 = input03.nextInt();
                int max = set01 > set02 ? set01: set02;
                max = max > set03 ? max : set03;
                System.out.println("The max number is: "+max);
                flag=false;
            } else {
                System.out.println("ERROR,reput in the numbers.");
            }
        }
    }
}
