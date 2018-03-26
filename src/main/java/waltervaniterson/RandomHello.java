package waltervaniterson;

import java.util.Random;

public class RandomHello {
    public static void main(String[] args) {
        System.out.println(getWord(3872044814794l) + " " + getWord(2088873075453l) + "!");
    }

    static String getWord(long value) {
        byte[] bytes = new byte[5];
        new Random(value).nextBytes(bytes);
        return new String(bytes);
    }
}