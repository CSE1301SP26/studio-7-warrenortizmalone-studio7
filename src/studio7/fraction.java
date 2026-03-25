public class fraction {
    private int nIn;
    private int dIn;

    public fraction(int nIn, int dIn) {
         this.nIn = nIn;
         this.dIn = dIn;
        
        //System.out.println(n + "/" + d);
        // System.out.println("Reciprocal: " + d + "/" + n);
    }

    // mutator
    public void toString(int n, int d) {
        System.out.println( d + "/" + n);
    }

    public fraction add(fraction f2) {
        int newN = f2.dIn * this.nIn + this.dIn * f2.nIn;
        int newD = this.dIn * f2.dIn;
        fraction f3 = new fraction(newN, newD);
        return f3;
    }

    // d2 * n1 + n2 * d1
    // -------------------------
    // d2 * d1
    public static void main(String[] args) {
        fraction f1 = new fraction(2, 3);
        fraction f2 = new fraction(1, 4);
        fraction f3 = f1.add(f2);
        f3.toString();
    }
}
