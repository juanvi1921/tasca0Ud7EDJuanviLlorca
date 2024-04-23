import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public static Integer suma(String num) {
        List<String> numeros = List.of(num.split(","));
        List<Integer> numerosInt = new ArrayList<>();
        Integer total = 0;
        if (!num.isEmpty()) {
            if (num.lastIndexOf(",") == num.length()-1) return -1;
            if(num.contains("-")) {
                System.out.println("Numero negativo no permitido");
                return -1;
            }
            for (int i = 0; i < numeros.size(); i++) {
                if (Integer.parseInt(numeros.get(i)) <= 1000) {
                    numerosInt.add(Integer.parseInt(numeros.get(i)));
                    total += numerosInt.get(i);
                }
            }
        }
        return total;
    }
}
