//Q6
public class Clg_09_program {
    public static void main(String[] args) {
         int a = 10;
         int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = "+a+", b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " +a+ ", b = "+b);
    }
}

