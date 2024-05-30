package src;

public class Overloaded_methods {
    public static void main(String[] args) {

        int s = add(5,8, 28);
        System.out.println(s);
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
