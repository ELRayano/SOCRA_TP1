package com.epita.socra.app;

public class Sum {
    public static int sum(int oldsum, String s)
    {
        int tmp = 0;
        if (s.charAt(0) == '.' || s.charAt(0) == '_')
            tmp = Arabic.convert_to_arabic(s);
        else
            tmp = Integer.parseInt(s);
        oldsum += tmp;
        return oldsum;

    }
}
