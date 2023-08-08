import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка на полиндром");
        char[] c = {'s', 'u', 'u', 's'};
        int first = c[0];
        int second = c[1];
        int three = c[2];
        int four = c[3];


        System.out.println();
        if (first==four && second==three ) {
            System.out.println("это палиндром");
        } else {
            System.out.println("это не палиндром");
        }
        }
    }


