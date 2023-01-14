import java.util.Objects;

public class main {
    public static void main(String[] args) {

        String[] tags = {"-fib", "-fac", "-e"};

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
                }else { // arg should be an integer
                    System.out.print("");
                }
            }
        }
        if(!goodInput || args.length == 0){
            System.out.print("--- Assign 1 Help ---\n" +
                    "-fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]\n" +
                    "-fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]\n" +
                    "-e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
        }else {
            System.out.print("Good input"); //todo: delete
        }
    }
}
