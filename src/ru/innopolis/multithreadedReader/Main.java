package ru.innopolis.multithreadedReader;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL urlProperty = new URL("https://raw.githubusercontent.com/yuramilkyway/14.09task/master/.property");
        URL urlDictionary = new URL("https://raw.githubusercontent.com/yuramilkyway/14.09task/master/words");
        ReaderDictionary readerDictionary = new ReaderDictionary(urlDictionary);
        readerDictionary.reader();
    }
}
