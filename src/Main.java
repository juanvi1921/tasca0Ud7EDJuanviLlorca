public class Main {
    public static void main(String[] args) {
        fizzBuzzPrimeros100();
    }
    public static void fizzBuzzPrimeros100() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Fizzbuzz.fizzBuzzMetodo(i));
        }
    }
}