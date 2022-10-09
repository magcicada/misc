import java.util.Scanner;

public class new01 {
    public static void main(String[] args){
        System.out.println("Full Sec time: ");
        long time = new Scanner(System.in).nextLong();
        int hour=0,min=0,sec=0;
        hour = (int) (time/(60*60));
        min = (int) ((time-hour*3600)/60);
        sec = (int) (time-hour*3600-min*60);
        System.out.println(hour+" : "+min+" : "+sec);
    }
}
