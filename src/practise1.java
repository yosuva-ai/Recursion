public class practise1 {
    public static void main(String[] args) {
        int res = oddOrEven(1);
        System.out.println(res);
    }
    public static int oddOrEven(int a){
        if (a>10){
            return a;
        }
        if(a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        return oddOrEven(a+1);
    }
}
