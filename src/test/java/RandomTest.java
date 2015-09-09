import java.security.SecureRandom;

import org.junit.Test;

public class RandomTest {

    final int samples = 10000;

    int[] cnters = new int[1000];
    
    @Test
    public void shouldProduceSomeRandomNumbers() {
        for (int i = 0; i < samples; i++) {
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
