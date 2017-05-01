/**
 * Created by chaoranchen on 4/30/17.
 */
public class HashMap<K, V> implements Map<K, V> {

    private Entry<K, V>[] arr;

    private int hash(K key) {
        return (key.hashCode() % arr.length);
    }

    private int size;

    public HashMap() {
        arr = new Entry[50];
        size = 0;
    }

    public void clear() {
        int size = arr.length;
        arr = new Entry[size];
    }

    public boolean containsKey(K key) {
        Entry<K, V> head = arr[hash(key)];
        while (head != null) {
            if (head.getKey().equals(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < arr.length; i++) {
            Entry<K, V> head = arr[i];
            while (head != null) {
                if (head.getValue().equals(value)) {
                    return true;
                }
                head = head.getNext();
            }
        }
        return false;
    }

    public V get(K key) {
        Entry<K, V> head = arr[hash(key)];
        while (head != null) {
            if (head.getKey().equals(key)) {
                return head.getValue();
            }
            head = head.getNext();
        }
        return null;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    // This method associates the specified key with the specified value in the Map
    // and returns the newly associated value
    public V put(K key, V value) {
        if (containsKey(key)) {
            // If the specified key is already associated with a non-null value,
            // the association is left unchanged, and the current value is returned instead.
            return get(key);
        } else {
            Entry<K, V> entry = new Entry<K, V>(key, value);
            Entry<K, V> head = arr[hash(key)];
            if (head != null) {
                while (head.getNext() != null) {
                    head = head.getNext();
                }
                head.setNext(entry);
            } else {
                arr[hash(key)] = entry;
            }
            size++;
            return value;
        }
    }

    // This method removes and returns the mapping for the specified key in the Map
    // if it is present, and returns null otherwise.
    public V remove(K key) {
        if (!containsKey(key)) {
            return null;
        }
        V res = get(key);
        Entry<K, V> head = arr[hash(key)];
        arr[hash(key)] = deleteEntry(head, key);
        size--;
        return res;
    }

    // This method replaces and returns the mapping for the specified key only
    // if it is currently mapped to to some value, and returns null otherwise.
    public V replace(K key, V value) {
        if (!containsKey(key)) {
            return null;
        }
        V res = null;
        Entry head = arr[hash(key)];
        while (head != null) {
            if (head.getKey().equals(key)) {
                head.setValue(value);
                break;
            }
            head = head.getNext();
        }
        return value;
    }

    // This method returns the number of key-value mappings in the Map.
    public int size() {
        return size;
    }

    public String toString() {
        String res = "{";
        if (size == 0) {
            res += "}";
        } else {
            int tempSize = size;
            for (int i = 0; i < arr.length; i++) {
                Entry head = arr[i];
                while (head != null) {
                    if (tempSize > 1) {
                        res += head.getKey() + ": " + head.getValue() + ", ";
                    } else {
                        res += head.getKey() + ": " + head.getValue();
                    }
                    tempSize--;
                    head = head.getNext();
                }
            }
            res += "}";
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);
        map.put("a", 87);
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());
        map.put("b", 90);
        map.put("c", 95);
        map.put("d", 100);
        System.out.println(map);
        map.put("e", 80);
        map.put("f", 70);
        System.out.println(map);
        System.out.println(map.containsKey("f"));
        System.out.println(map.containsValue(80));
        map.remove("d");
        System.out.println(map);
        map.replace("b", 60);
        System.out.println(map);
    }

    private Entry deleteEntry(Entry head, K key) {
        Entry e = head;
        if (e.getKey().equals(key)) {
            return e.getNext();
        }
        while (e.getNext() != null) {
            if (e.getNext().getKey().equals(key)) {
                e.setNext(e.getNext().getNext());
                return e;
            }
            e = e.getNext();
        }
        return head;
    }

}
