import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Fighter Huzeyfe = new Fighter( "Huzeyfe", 10,100,25 , 60);

        Fighter Nevfel = new Fighter( "Nevfel", 15,120,15,70);

        Ring r= new Ring( Huzeyfe ,Nevfel, 50,100);
        r.run();

    }
}
