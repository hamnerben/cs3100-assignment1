public class main {
    public static void main(String[] args) {

        String[] tags = {"-fib", "-fac", "-e"};

        // sanity check on arguments
        boolean goodInput = false;
        if(args.length % 2 == 0){
            goodInput = true;
            boolean matchesTag;
            for(int i = 0; i < args.length; i++){

                if(i % 2 == 0){ // arg should be tag
                    matchesTag = false;
                    for(String tag : tags){ // iterate through possible tags
                        if(args[i] == tag){
                            matchesTag = true; // the arg is valid
                        }
                    }
                }else { // arg should be an integer
                    System.out.print("");
                }
            }
        }
    }
}
