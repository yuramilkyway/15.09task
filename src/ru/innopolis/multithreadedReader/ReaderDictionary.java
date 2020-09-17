package ru.innopolis.multithreadedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class ReaderDictionary {
    final private URL url;
    private ArrayList<String> words = new ArrayList<>();

    public ReaderDictionary(URL url) {
        this.url = url;
    }

    public void reader() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String temp = in.readLine();
        while (temp != null) {
            String[] strTemp = temp.split(" ");
            words.add(strTemp[0]);
            temp = in.readLine();
        }
        in.close();

        for (String str : words) {
            System.out.println(str);
        }
    }
}
