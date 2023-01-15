import java.math.BigInteger;
import java.util.Objects;

public class Assign1 {
    static String[] tags = {"-fib", "-fac", "-e"};
    static int[] fibRange = { 0, 40 };
    static int[] facRange = { 0, 2147483647 };
    static int[] eRange = { 0, 2147483647 };

    /**
     * accepts an int and prints a state finding the fibonacci number
     * @param n the number to find the fibonacci number
     */
    public static void fib(int n) {
        if(n < fibRange[0] || n > fibRange[1]){
            System.out.println("Fibonacci valid range is [" + fibRange[0] + ", " + fibRange[1] + "]");
        }else {
            System.out.println("Fibonacci of " + n + " is " + fibRecursive(n+1));
        }
    }

    /***
     * recursive method to find the fibonacci number
     * @param n int to pass down through the recursion
     * @return previous iteration of the fib nubmer
     */
    private static int fibRecursive(int n){
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void fac(int n) {
        if(n < facRange[0] || n > facRange[1]){
            System.out.println("Factorial valid range is [" + facRange[0] + ", " + facRange[1] + "]");
        }else {
            BigInteger fact = BigInteger.ONE;
            for(int i = 1; i <= n; i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + n + " is " + fact);
        }
    }

    public static void main(String[] args) {

        // sanity check on arguments
        boolean goodInput = false;
        if(args.length % 2 == 0){
            boolean matchesTag;
            for(int i = 0; i < args.length; i++){

                if(i % 2 == 0){ // arg should be tag
                    matchesTag = false;
                    for(String tag : tags){ // iterate through possible tags
                        if(Objects.equals(args[i], tag)){
                            matchesTag = true; // the arg is valid
                        }
                    }
                    if(matchesTag){
                        goodInput = true;
                    }
                }else { // arg should be a digit
                    try{
                        Integer.parseInt(args[i]);
                    }catch(NumberFormatException e){
                        //not a digit
                        goodInput = false;
                    }
                }
            }
        }
        if(!goodInput || args.length == 0){
            System.out.print("--- Assign 1 Help ---\n" +
                    "-fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]\n" +
                    "-fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]\n" +
                    "-e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
        }else {
            System.out.println("Good input"); //todo: delete
            fac(10);
            fac(0);
        }
    }



}
