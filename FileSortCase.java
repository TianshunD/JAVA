package com.FileSort;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class FileSortCase {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\10492\\Desktop\\File\\src.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\10492\\Desktop\\File\\des.txt"));
        String line;
        while ((line = br.readLine())!=null) {
            String[] array = line.split("\\.");
            map.put(array[0],array[1]);
        }
        for (String key : map.keySet()) {
            bw.write(key + "." + map.get(key));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
