package com.epita.socra.app;

import java.util.TreeMap;

public class Arabic {
    public static int convert_to_arabic(String str)
    {
        TreeMap<String, Integer> m = new TreeMap<String, Integer>();
        m.put(". _ _ _ _", 1);
        m.put(". . _ _ _", 2);
        m.put(". . . _ _", 3);
        m.put(". . . . _", 4);
        m.put(". . . . .", 5);
        m.put("_ . . . .", 6);
        m.put("_ _ . . .", 7);
        m.put("_ _ _ . .", 8);
        m.put("_ _ _ _ .", 9);
        m.put("_ _ _ _ _", 0);
        int res = 0;
        int sz = str.length();
        for(int i = 0; i < sz; i+= 10)
        {
            res *= 10;
            res += m.get(str.substring(i, i+9));
        }
        return res;
    }

}
