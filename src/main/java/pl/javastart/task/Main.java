package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    @SuppressWarnings({"checkstyle:WhitespaceAfter", "checkstyle:NeedBraces"})
    public static void main(String[] args) {

        int[][] tab = new int[100][100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy wymiar tablicy: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj drugi wymiar tablicy: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        tab[a][b] = a * b;

        System.out.println(("Tablica: " + Arrays.toString(tab[a]) + " " + Arrays.toString(tab[b])));

    }
}