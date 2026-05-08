package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class fuvarkezelo {

    static List<Fuvar> fuvarok = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Path path = Path.of("fuvarok.csv");

        String tartalom = Files.readString(path);
        //System.out.println(tartalom);

        List<String> sorok = Files.readAllLines(path);

        for (int i = 1; i < sorok.size(); i++) {

            String sor = sorok.get(i);

            String[] s = sor.split(",");

            String rendszam = s[0];
            int ido = Integer.parseInt(s[1]);
            double osszeg = Double.parseDouble(s[2]);
            String fizetesiMod = s[3];

            Fuvar fuvar = new Fuvar(rendszam, ido, osszeg, fizetesiMod);

            fuvarok.add(fuvar);

        }
        osszege();
        double tmp=0;
        double index=0;
        for (int i = 0; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getOsszeg()>tmp){
                tmp=fuvarok.get(i).getOsszeg();
                index=fuvarok.get(i);
                
                
            }
            
        }

    }

    private static void osszege() {
        double osszeg=0;
        for (int j = 0; j < fuvarok.size(); j++) {
            osszeg+=fuvarok.get(j).getOsszeg();
        }
        System.out.println("osszes fuvar értéke:"+osszeg);
    }
    
}
