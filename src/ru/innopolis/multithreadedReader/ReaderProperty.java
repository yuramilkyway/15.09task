package ru.innopolis.multithreadedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class ReaderProperty {
    final private URL url;
    private ArrayList<String> words = new ArrayList<>();

    public ReaderProperty(URL url) {
        this.url = url;
    }

    private void readerProperty () throws IOException {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String[] countWord = in.readLine().split("-");
            String[] endOfSentenceCharacters = in.readLine().split("");
            int countOffer = Integer.parseInt(in.readLine());

            System.out.printf("count word: %s\nend of sentence Characters: %s\ncount offer: %s\n",
                    Arrays.toString(countWord), Arrays.toString(endOfSentenceCharacters), countOffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

