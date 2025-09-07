import java.util.*;

public class AIChatbot {
    private static Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hello", "Hi! How can I help you?");
        responses.put("hi", "Hello! Nice to meet you.");
        responses.put("how are you", "I'm just a bot, but I'm doing fine! What about you?");
        responses.put("bye", "Goodbye! Have a great day.");
        responses.put("thanks", "You're welcome!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) break;

            String reply = responses.getOrDefault(input, "Sorry, I don't understand that.");
            System.out.println("Chatbot: " + reply);
        }
        sc.close();
    }
}
