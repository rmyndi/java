import java.util.LinkedList;

public class nomor5 {
    public static void main(String[] args) {
        LinkedList<Integer> L = new LinkedList();
        L.add(10);
        L.add(20);
        L.add(30);
        L.add(40);
        L.add(50);

        for (Object stackList : L) {
            System.out.print(stackList + "\t");
        }
    }
}
