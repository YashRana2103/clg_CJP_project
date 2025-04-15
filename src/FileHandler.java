import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }
}
