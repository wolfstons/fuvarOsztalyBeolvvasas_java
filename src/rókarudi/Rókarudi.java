/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rókarudi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PácziBalázs(SZF_N_20
 */
public class Rókarudi {

    static List<Fuvar> fuvarok = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Path path = Path.of("fuvarok.csv");

        String tartalom = Files.readString(path);
        System.out.println(tartalom);

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

    }
}
