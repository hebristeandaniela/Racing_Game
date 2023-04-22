package org.example.utils;

import java.util.Scanner;

public class ScannerUtils {

    static final Scanner scanner = new Scanner(System.in);

    public static int nextIntAndMoveToNextLine(){
        int integer =scanner.nextInt();
        scanner.nextLine();
        return integer;
    }
public static String nextLine(){
        return scanner.nextLine();
}

}
