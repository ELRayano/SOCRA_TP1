package com.epita.socra.app;

import javax.print.DocFlavor;
import java.util.TreeMap;

public class Morse {
    public static String convert_to_morse(int n)
    {
        if(n == 0)
            return "_ _ _ _ _";
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(1, ". _ _ _ _");
        m.put(2, ". . _ _ _");
        m.put(3, ". . . _ _");
        m.put(4, ". . . . _");
        m.put(5, ". . . . .");
        m.put(6, "_ . . . .");
        m.put(7, "_ _ . . .");
        m.put(8, "_ _ _ . .");
        m.put(9, "_ _ _ _ .");
        m.put(0, "_ _ _ _ _");
        String res = "";
        while (n > 9)
        {
            res = " " + m.get(n % 10) + res;
            n = n / 10;
        }
        res = m.get(n) + res;
        return res;
    }
}
