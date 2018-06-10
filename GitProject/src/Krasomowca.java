import java.util.HashSet;
import java.util.Set;

public class Krasomowca {
    public static void main(String[] args) {
        String[] listaSlow1 = {"architektura wielowarstwowa", "30000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka",
                "interfejs internetowy", "inteligentna karta", "rozwiązanie dynamiczne", "sześć sigma", "przenikliwość"};
        String[] listaSlow2 = {"zwiększa możliwości", "poprawia atrakcyjność", "pomnaża wartość", "opracowana dla", "bazująca na",
                "rozproszona", "skoncentrowana na", "udostępniona"};
        String[] listaSlow3 = {"procesu", "punktu wpisywania", "witryny", "wersji", "paradygmatu", "strategii", "portalu"};

        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;

        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);

        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

        System.out.println("To jest to, czego nam trzeba: " + zdanie);

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Zenon");
        otherSet.add("Marek");

        setWithNames.addAll(otherSet);
        System.out.println(otherSet.size());
        Boolean ade = true;
        boolean edu = false;
        int i = new Integer(10);
        System.out.println(i);
        Integer hg = 10;


    }
}
