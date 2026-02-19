class Print1toN {

    public static void func(int n){

        if(n == 0)   // base case
            return;

        func(n-1);   // pehle chhota problem solve

        System.out.print(n + " ");   // phir print
    }

    public static void main(String[] args) {
        func(5);
    }
}
