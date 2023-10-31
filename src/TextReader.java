import java.util.Scanner;

public class TextReader {
    public String readText() {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        String txt;

        System.out.println("Skriv in text. Skriv 'stop' för att avsluta.");

        while (true) {
            txt = scanner.nextLine();
            if (txt.equals("stop")) {
                break;
            }
            text.append(txt).append("\n");
        }

        return text.toString();
    }
}

class TextCounter {
    public static void main(String[] args) {

        TextReader textReader = new TextReader();

        String inputText = textReader.readText();

        int radCount = 0;
        int txtCount = 0;

        Scanner scan = new Scanner(inputText);

        while (scan.hasNextLine()) {

            String line = scan.nextLine();

            if (!line.equals("stop")) {
                radCount++;
                txtCount += line.length();
            }
        }

        System.out.println("Följande antal tecken skrevs in: " + txtCount);
        System.out.println("I såhär många omgångar: " + radCount);
    }
}
