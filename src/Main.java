import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenerateQuotes quotes = new GenerateQuotes();
        System.out.println(quotes.process("Hello World"));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);

        numbers.stream()
                .map(number -> number = number * 2)
        .forEach(System.out::println);

    }
}