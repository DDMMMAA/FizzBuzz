public class Multiples {
    public static void main(String[] args) {
        int num_multiples = 0;
        int i = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                num_multiples++;
            }
            i++;
        }
        System.out.println(num_multiples);
    }
}
