package com.epita.socra.app;

import com.epita.socra.app.tools.*;
import com.epita.socra.app.Morse;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        int res = 0;
        while (true)
        {
            String input = adapter.read();
            res = Sum.sum(res, input);
            adapter.write(Integer.toString(res));
        }
    }

}
