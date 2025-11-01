import java.util.Arrays;

public class Exemplu {
    public static void main(String[] args) {

        int[] cifre = {22, 33, 15, 40, 91};
        System.out.println(Arrays.toString(cifre));
        System.out.println("Lungimea tabloului este: " + cifre.length);
        cifre[0] = 19;
        System.out.println(cifre[0]);
        cifre[4] = 44;
        System.out.println(Arrays.toString(cifre));

    }
}
