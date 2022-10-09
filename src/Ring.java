public class Ring {
    Fighter f1;
    Fighter f2;

    int maxWeight;
    int minWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    public void run() {
        int round = 1;
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======= " + round + ". Round =======");
                double whoIsStart = Math.random() * 100;
                if (whoIsStart <= 50) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printHealty();
                round++;
            }
        } else {
            System.out.println("Sporcular aynı siklette değiller!");
        }
    }
    public boolean checkWeight(){
        return ((f1.weight >= minWeight) && ( f1.weight <= maxWeight) && (f2.weight >= minWeight) && (f2.weight <= maxWeight));

    }
    public boolean isWin(){
        if(f1.health == 0 ){
            System.out.println( f2.name + " maçı kazandı!!");
        }
        if (f2.health == 0){
            System.out.println(f1.name + " maçı kazandı!!");
        }
        return false;
    }
    public void printHealty(){
        System.out.println(f1.name + " kalan can: " + f1.health);
        System.out.println(f2.name + " kalan can: " + f2.health);
    }
}
