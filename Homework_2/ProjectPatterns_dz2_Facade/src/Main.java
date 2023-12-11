public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("110", "1"));
        System.out.println(bins.sum("1010", "1001010"));
        System.out.println(bins.mult("10", "100"));
        System.out.println(bins.mult("101001", "101110"));
    }
}
