public class die {
    private int nIn;

    private int die;

    public die(int nIn) {
        int n = nIn;

        die = (int) (Math.random() * (n) + 1);

    }

    public int toInt() {
        return die;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 125; i++) {
            die d1 = new die(6);
            d1.toInt();
            System.out.println(d1.toInt());
        }
    }

}
