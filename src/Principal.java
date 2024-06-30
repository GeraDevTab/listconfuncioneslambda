import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for(Integer i: lista1) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("***********************divison antes de funcion lambda");
        List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        lista2.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        List<String> palabras = Arrays.asList("Java", "Stream", "Operaciones", "Intermedias");
        List<Integer> tamanios = palabras.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(tamanios);

    }
}
