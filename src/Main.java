import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        // Agregar al menos 10 diferentes cadenas de texto al ArrayList
        stringList.add("computacion");
        stringList.add("Eduardo");
        stringList.add("Java");
        stringList.add("uno");
        stringList.add("ordenamiento");
        stringList.add("alfabetico");
        stringList.add("longitud");
        stringList.add("referencia");
        stringList.add("lambda");
        stringList.add("clase");

        System.out.println("Original:");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoPorLongitudAnonima = new InterfazOrdenamiento() {
            @Override
            public void ordenar(List<String> lista) {
                lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
            }
        };
        ordenamientoPorLongitudAnonima.ordenar(stringList);
        System.out.println("Ordenado por longitud (clase anónima):");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoPorLongitudLambda =
                lista -> lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        ordenamientoPorLongitudLambda.ordenar(stringList);
        System.out.println("Ordenado por longitud (expresión lambda):");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoPorLongitudReferencia =
                lista -> lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        ordenamientoPorLongitudReferencia.ordenar(stringList);
        System.out.println("Ordenado por longitud (método de referencia):");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoAlfabeticoAnonima = new InterfazOrdenamiento() {
            @Override
            public void ordenar(List<String> lista) {
                lista.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
            }
        };
        ordenamientoAlfabeticoAnonima.ordenar(stringList);
        System.out.println("Ordenado alfabéticamente (clase anónima):");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoAlfabeticoLambda =
                lista -> lista.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        ordenamientoAlfabeticoLambda.ordenar(stringList);
        System.out.println("Ordenado alfabéticamente (expresión lambda):");
        System.out.println(stringList);

        InterfazOrdenamiento ordenamientoAlfabeticoReferencia =
                lista -> lista.sort(String::compareToIgnoreCase);
        ordenamientoAlfabeticoReferencia.ordenar(stringList);
        System.out.println("Ordenado alfabéticamente (método de referencia):");
        System.out.println(stringList);
    }
}