import java.util.Scanner;

public class Good {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pertanyaan yang ingin diajukan
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini? (Jawab Yoi/Enggak): ");
        String jawaban = scanner.nextLine();

        // Menyimpan jawaban dalam format yang lebih sederhana
        String normalizedAnswer = jawaban.toLowerCase().trim();

        if (normalizedAnswer.equals("yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else {
            System.out.println("Tetep cakep sih. Sing penting paham konsepe");
        }

        // Menutup scanner
        scanner.close();
    }
}