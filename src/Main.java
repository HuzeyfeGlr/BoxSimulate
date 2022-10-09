import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Fighter ali = new Fighter( "ALİ", 10,100,25 , 60);

        Fighter veli = new Fighter( "VELİ", 15,120,15,70);

        Ring r= new Ring( ali ,veli, 50,100);
        r.run();

    }
}
