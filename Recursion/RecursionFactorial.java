class RecursionFactorial {

    public static int func(int n){

        if(n == 1){      // base case
            return 1;
        }
        return n * func(n-1);
    }

    public static void main(String[] args) {

        int result = func(5);
        System.out.println("Factorial is " + result);
    }
}
