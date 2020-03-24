import java.util.Collections;
import java.util.Vector;

public class Resolution {
    public static void main(String[] args){
        long start, end, res;
        Vector<Long> resolutions = new Vector<>();
        for(int i=1; i<=200; i++) {
            start = System.nanoTime();
            do {
                end = System.nanoTime();
            } while (start == end);
            res = end - start;
            resolutions.add(res);
        }

        Collections.sort(resolutions);
        Long median = resolutions.get(50);
        for (long i: resolutions) {
            System.out.println(i);
        }
    }
}
