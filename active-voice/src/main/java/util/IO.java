package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IO {


    public Map<Integer, String> writeMap(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        Map<Integer, String> map = new LinkedHashMap<>();
        int k = 0;
        while (sc.hasNextLine()) {
            map.put(k++, sc.nextLine());
        }
        sc.close();
        return map;
    }

    public List<String> writeList(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        sc.close();
        return list;
    }
}
