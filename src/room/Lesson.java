package room;


public class Lesson {

    public static void main(String[] args) {

        MyMap<Integer,String> map = new MyMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        System.out.println(map);

        System.out.println(map.get(5));

        System.out.println(map.entrySet());

        for (Pair<Integer, String> element : map.entrySet()) {
            System.out.println(element.key);
            System.out.println(element.value);
        }

    }
}
