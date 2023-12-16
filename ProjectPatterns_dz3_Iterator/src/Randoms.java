import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;

    public Randoms(int min, int max) {
            this.random = new Random(max){
                @Override
                public int nextInt() {
                    return new Random().nextInt(max - min + 1) + min;
                }
            };

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt();
            }
        };
    }
}
