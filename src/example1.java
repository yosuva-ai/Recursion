public class example1 {
    public static void main(String[] args) {
        n(10);
    }
    public static void n(int a){
        //base case
        if (a == 1){
            System.out.println(1);
        }

        //Rescursive case
        else {
            System.out.println(a);
            n(a-1);
        }
    }
}
