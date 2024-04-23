import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public static Integer suma(String num) {
        List<String> numeros = List.of(num.split(","));
        List<Integer> numerosInt = new ArrayList<>();
        Integer total = 0;
        if (!num.isEmpty()) {
            for (int i = 0; i < numeros.size(); i++) {
                numerosInt.add(Integer.parseInt(numeros.get(i)));
                total += numerosInt.get(i);
            }
        }
        return total;
    }
}
