package room;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<T, E> {

    Set<Pair> mySet = new HashSet<Pair>();

    public void put(T key, E value) {
        if (mySet.contains(new Pair(key, value))) {
            mySet.remove(new Pair(key, value));
        }
        mySet.add(new Pair(key, value));
    }

    public E get(T key) {
        Pair pair = new Pair(key, new Object());
        Iterator<Pair> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            Pair element = iterator.next();

            if(element.equals(pair)) {
                return (E) element.value;
            }
        }
        return null;
    }

    public Set<Pair> entrySet() {
        return mySet;
    }

    @Override
    public String toString() {
        return mySet.toString();
    }
}
