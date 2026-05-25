public class example2 {
    public static void main(String[] args) {
        int res = loop(1);
        System.out.println(res);
    }
    public static int loop(int a){
        if (a == 10){
            System.out.println(10);
            return a;
        }
        else {
            System.out.println(a);
           return loop(a + 1);
        }
    }
}
