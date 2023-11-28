import java.io.*;
import java.util.Scanner;
public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'file' to count the words in a file or 'text' to count the words in a text: ");
        String input_Type = scanner.nextLine();
    
        String text = "";
        if (input_Type.equalsIgnoreCase("file")) {
            System.out.println("Enter the file path: ");
            String filePath = scanner.nextLine();
            text = read_File_Content(filePath);
        } else if (input_Type.equalsIgnoreCase("text")) {
            System.out.println("Enter the text: ");
            text = scanner.nextLine();
        } else {
            System.out.println("Invalid input. Please try again.");
            System.exit(0);
        }

        if (text != null) {
            int word_Count = count_Words(text);
            System.out.println("Total count of words: " + word_Count);
        } else {
            System.out.println("Unable to read the file or text. Please check the file path or text input and try again.");
        }
         scanner.close();
    }

    private static String read_File_Content(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    private static int count_Words(String text) {
        String[] words = text.split("[^a-zA-Z0-9']+");
        return words.length;
    }
}