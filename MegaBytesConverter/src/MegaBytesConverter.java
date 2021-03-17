import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert amount of data in KiloBytes");
        int data = scanner.nextInt();
        printMegabytesAndKiloBytes(data);
    }
    public static void printMegabytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
        int megaBytes =  kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }

    }
}
