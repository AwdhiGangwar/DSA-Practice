// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CountVowels {
    public static void main(String[] args) {
        char arr[]={'a','e','i','o','u'};
        int arrln=arr.length;
        String s="helloworld!";
        int strln=s.length();
        int vowelcount=0;
        for(int i=0;i<strln;i++){
            for(int j=0;j<=arrln-1;j++){
            if(s.charAt(i)==arr[j]){
                vowelcount++;
            }
            }
        }
    System.out.println(vowelcount);
    }
}