import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chaoranchen on 4/30/17.
 */
public class HashMapTest {
    @Test
    public void clear() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.clear();
        boolean result = true;
        if (!map.toString().equals("{}"))
            result = false;
        assertTrue(result);
    }

    @Test
    public void containsKey() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        boolean result1 = map.containsKey("e");
        assertTrue(result1);
        boolean result2 = map.containsKey("h");
        assertFalse(result2);
    }

    @Test
    public void containsValue() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        boolean result1 = map.containsValue(100);
        assertTrue(result1);
        boolean result2 = map.containsValue(85);
        assertFalse(result2);
    }

    @Test
    public void get() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        Integer result1 = map.get("c");
        assertTrue(result1.equals(95));
        Object result2 = map.get("k");
        assertTrue(result2 == null);
    }

    @Test
    public void isEmpty() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        assertTrue(map.isEmpty());
        map.put("a", 98);
        assertFalse(map.isEmpty());
    }

    @Test
    public void put() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        map.put("a", 80);
        Integer result = map.get("a");
        assertTrue(result.equals(87));
        assertTrue(map.size() == 6);
    }

    @Test
    public void remove() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        map.put("a", 80);
        map.put("d", 10);
        Integer result = map.remove("a");
        assertTrue(result.equals(87));
        assertTrue(map.size() == 5);
        Integer result2 = map.remove("g");
        assertTrue(result2 == null);
    }

    @Test
    public void replace() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        map.put("a", 80);
        map.put("d", 10);
        Integer result = map.replace("a", 80);
        assertTrue(result.equals(map.get("a")));
    }

    @Test
    public void size() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 87);
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        map.put("e", 80);
        map.put("f", 70);
        map.put("a", 80);
        map.put("d", 10);
        map.replace("a", 80);
        map.remove("g");
        map.remove("d");
        assertTrue(map.size() == 5);
    }

}