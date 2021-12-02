import java.util.function.BiFunction;

public class MyClass {
    public static void main(String[] args) {
        BiFunction<Long,Long,Long> produceNumbers=(x,y) -> {
            long result = x;
            for(long i = x + 1; i <= y; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(produceNumbers.apply(5l,15l));
    }
}
