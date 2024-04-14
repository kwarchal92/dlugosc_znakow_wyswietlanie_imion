package dlugosc_znakow_wieksza_od_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Katarzyna", "Ola", "Paweł", "Michał");

        imiona.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);

    }
    
}
