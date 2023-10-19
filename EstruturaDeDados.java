import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("John");
        nomes.add("Vini");
        nomes.add("Elias");
        
        System.out.println(nomes.get(0));

        for (String nome : nomes) {
            System.out.println("O nome é: " +nome);
        }

        // ForEach
        nomes.forEach(nome -> System.out.println("O nome é: "+nome));
    }
}
