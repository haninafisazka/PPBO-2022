import java.util.Scanner;

public class PPBO_05_Latihan2 {
    public static void main(String[] args) {
        
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();
        
        int a;
        if(s.matches("^[AaiIuUeEoO].*")){
            a = 1;
        }else if(s.matches("^(.*[^ng])(ng)")){
            a = 2;
        } else {
            a = -1;
        }
        
        System.out.println(a);
    }
}