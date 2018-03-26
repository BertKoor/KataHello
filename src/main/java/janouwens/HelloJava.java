package janouwens;

import java.util.Random;

public class HelloJava {
    public static void main(String... args) {
        String magic0 = "What now?! Ah-Ha! I coded, I programmed, and I spoofed and I split the string." +
                " I wonder and ask, will love come my way for this? Since you would say," +
                " what code could do such a thing? Awesome code, yo!";
        int magic1 = 172;
        int magic2 = 200;
        Random magic3 = new Random(magic1);
        int magic4 = magic3.nextInt(magic2);
        String magic5 = "";
        for (int i = 1; i <= magic4; i++) {
            magic5 += magic0.charAt(magic3.nextInt(magic2));
        }
        System.out.println(magic5);
    }
}