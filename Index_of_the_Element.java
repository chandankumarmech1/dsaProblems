import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> obj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            obj.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int a = obj.indexOf(k);

        System.out.println(a);
    }
}