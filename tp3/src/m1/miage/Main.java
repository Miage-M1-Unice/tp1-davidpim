package m1.miage;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args){
        try {
            URL u = new URL[] {new URL("./tp3_bis/")};

            URLClassLoader load = new URLClassLoader(u);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Test t = new Test();
    }
}
