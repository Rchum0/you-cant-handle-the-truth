import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //HandleTruth.wordCount();
    }
    @Test
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
        String msg;
        switch (num) {
            case 1:
                msg = "fixing fixing fixing broken broken test";
                set = new HashSet<>();
                set.add("fixing");
                expected.put(3, set);
                key.add(3);
                set = new HashSet<>();
                set.add("broken");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("test");
                expected.put(1, set);
                key.add(1);
                break;
            case 2:
                msg = "dog";
                set.add("dog");
                expected.put(1, set);
                key.add(1);
                break;
            case 3:
                msg = "hi hi hi hi hi hi hi yes yes yes yes yes yes no no no";
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
                msg = "y y y y y y y y y is is is is this this being difficult";
                set = new HashSet<>();
                set.add("y");
                expected.put(9, set);
                key.add(9);
                set = new HashSet<>();
                set.add("is");
                expected.put(4, set);
                key.add(4);
                set = new HashSet<>();
                set.add("this");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("being");
                set.add("difficult");
                expected.put(1, set);
                key.add(1);
                break;
            case 5:
                msg = "hey hello hi bye good bye night";
                set = new HashSet<>();
                set.add("bye");
                expected.put(2, set);
                key.add(2);
                set = new HashSet<>();
                set.add("hey");
                set.add("good");
                set.add("hello");
                set.add("hi");
                set.add("night");
                expected.put(1, set);
                key.add(1);
                break;
            default:
                msg = " ";
                key.add(0);
        }
        return msg;
    }
}