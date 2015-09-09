import java.security.SecureRandom;


public class Main {

    final static int SAMPLES = 10000;
    static int[] cnters = new int[1000];
    
    public static void main(String[] args) {
        for (int i = 0; i < SAMPLES; i++) {
            SecureRandom sr = new SecureRandom();
            int rand = sr.nextInt(cnters.length - 1);
            cnters[rand]++;
        }

        for (int i = 0; i < cnters.length; i++) {
            if (i % 40 == 0) System.out.println();
            System.out.printf("%d=%d ", i, cnters[i]);
        }
    }

}
