package chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();
        double vol;

        mybox1.SetDim(10, 20,15);
        mybox2.SetDim(3,6,9);

        vol = mybox1.volume();
        System.out.println("Объем первого " +vol);
        vol = mybox2.volume();
        System.out.println("Объем второго " +vol);
    }
}
