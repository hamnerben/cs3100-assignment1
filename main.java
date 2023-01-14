public class main {
    public static void main(String[] args) {
        if ( args.length != 2){
            System.out.println("--- Assign 1 Help ---\n" +
                    "-fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]\n" +
                    "-fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]\n" +
                    "-e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
        }

        System.out.println(args[0]);
    }
}
