public class placetilesinafloor {
    public static void main(String[] args) {
int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        //vartically
        int verticalPlace = placeTiles(n - m, m);
        //horizontally
        int horizontalPlace = placeTiles(n - 1, m);

        return verticalPlace + horizontalPlace;
    }
}
