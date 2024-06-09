public class print5to1Recursion {
    public static void main(String[] args) {
        int n=1;
        //printnum(n);
        printnum1to10(n);
    }

//    public static void printnum(int n) {
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        printnum(n-1) ;
//    }
    public static void printnum1to10(int n) {
        if(n==11){
            return;
        }
        System.out.println(n);
        printnum1to10(n+1) ;
    }
}
