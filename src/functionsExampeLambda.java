
public interface functionsExampeLambda {
    String process(String input);
}
class lambdaExample {
    public static void main(String[] args) {
        String quote = "hello";
        functionsExampeLambda toUpper = input -> input.toUpperCase();
        String result = toUpper.process(quote);
        System.out.println(result);
    }
}


