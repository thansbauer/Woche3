package Beispiel1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Weapon> wList = new ArrayList<>();
        List<Weapon> wList2 = new ArrayList<>();
        Printable printer = (n) -> n.forEach((l) -> System.out.println(l.toString()));

        //Objekte aus csv File in wList speichern
        List<String> line = Files.lines(new File("weapons.csv").toPath()).skip(1).collect(Collectors.toList());
        for (int i = 0; i < line.size(); i++) {
            String tmp[] = line.get(i).split(";");
            wList.add(new Weapon(tmp[0], CombatType.valueOf(tmp[1]), DamageType.valueOf(tmp[2]), Integer.valueOf(tmp[3]), Integer.valueOf(tmp[4]), Integer.valueOf(tmp[5]), Integer.valueOf(tmp[6])));
        }

        Files.lines(new File ("weapons.csv").toPath()).skip(1).forEach((s) ->
        {
            String tmp[] = s.split("s");
            wList2.add(new Weapon(tmp[0], CombatType.valueOf(tmp[1]), DamageType.valueOf(tmp[2]), Integer.valueOf(tmp[3]), Integer.valueOf(tmp[4]), Integer.valueOf(tmp[5]), Integer.valueOf(tmp[6])));
        });

        //absteigend nach Damage sortieren
        wList.sort((w1, w2) -> {
            return w2.getDamage() - w1.getDamage();
        });

        //alphabetisch sortieren
        wList.sort((w1, w2) -> {
            if(w1.getcType().compareTo(w2.getcType()) == 0){
                if(w1.getdType().compareTo(w2.getdType()) == 0){
                    return w1.getName().compareTo(w2.getName());
                }else {
                    return w1.getdType().compareTo(w2.getdType());
                }
            }else {
                return w1.getcType().compareTo(w2.getcType());
            }
        });
        printer.print(wList);
    }
}
