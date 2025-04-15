import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> countWords(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("No text provided.");
            return new HashMap<>();
        }

        text = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public void displayWordFrequencies(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
