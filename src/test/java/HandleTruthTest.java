import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //HandleTruth.wordCount();
    }

    public void finalTest() {
        TreeMap<Integer, Set<String>> actual;
        TreeMap<Integer, Set<String>> expected = new TreeMap<>();
        int num = 5;//input for switch
        Queue key = new LinkedList();

        while (num > 0) {
            actual = HandleTruth.wordCount(test(num, expected, key));
            assertEquals(actual.size(), expected.size());
            num--;
            while (key.size() > 0) {
                int keys = (int) key.poll();
                assertEquals(actual.get(keys), expected.get(keys));
            }
            expected = new TreeMap<>();
        }
    }

    private static String test(int num, TreeMap<Integer, Set<String>> expected, Queue key) {
        Set<String> set = new HashSet<>();
        String text;
        switch (num) {
            case 1:
                text = "this is bad this is not bad it is not bad anymore";
                set = new HashSet<>();
                set.add("this");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("is");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("bad");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("not");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("it");
                expected.put(1, set);
                key.add(1);
                set = new HashSet<>();
                set.add("anymore");
                expected.put(1, set);
                key.add(1);
                break;
            case 2:
                text = "dog";
                set.add("dog");
                expected.put(1, set);
                key.add(1);
                break;
            case 3:
                text = "hi hi hi hi hi hi hi yes yes yes yes yes yes no no no";
                set = new HashSet<>();
                set.add("hi");
                expected.put(7, set);
                key.add(7);
                set = new HashSet<>();
                set.add("yes");
                expected.put(6, set);
                key.add(6);
                set = new HashSet<>();
                set.add("no");
                expected.put(3, set);
                key.add(3);
                break;
            case 4:
                text = "my dog likes to run and my other dog likes to walk and my fish likes to swim";
                set = new HashSet<>();
                set.add("my");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("likes");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("to");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("and");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("dog");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("run");
                set.add("other");
                set.add("walk");
                set.add("fish");
                set.add("swim");
                expected.put(1, set);
                key.add(1);
                break;
        }
    }

}