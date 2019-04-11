package edu.hillel.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        /*3)- создать linkedhashmap, занести в нее любые 10 пар ключ - значение (типа String)
                - вывести на консоль значение всех ключей и значений с помощью метода entrySet()
                - вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

        Map<String, String> myFamily = new LinkedHashMap<>();

        myFamily.put("5988155", "Vika");
        myFamily.put("8899523", "Dima");
        myFamily.put("8231144", "Nazar");
        myFamily.put("1285973", "Nataly");
        myFamily.put("2632299", "Alexander");
        myFamily.put("1224455", "Julia");
        myFamily.put("9554422", "Tatiana");
        myFamily.put("5255412", "Valentina");
        myFamily.put("5622388", "Dima");
        myFamily.put("3457889", "Sergey");

        myFamily.put("5622388", "Andrey");

        System.out.println("Implementation with entrySet");
        for (Map.Entry entry : myFamily.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Implementation with keySet");
        for (String key : myFamily.keySet()) {
            String value = myFamily.get(key);
            System.out.println(key + " : " + value);
        }
        /*4)создать класс Test2 {
            int intField;
            String stringField;
        }
        - сделать чтобы этот класс implements Comparable
        - создать TreeMap
        - создать любое количество объектов класса тест2 и добавить их в три-мап
        - вывести на консоль значение всех ключей и значений с помощью метода entrySet()
        - вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

        TreeMap<ZooAnimal, Integer> animal = new TreeMap<>();
        ZooAnimal lion = new ZooAnimal(7, "Leo");
        ZooAnimal giraffe = new ZooAnimal(6, "Gloria");
        ZooAnimal wolf = new ZooAnimal(1, "Rex");
        ZooAnimal hippopotamus = new ZooAnimal(3, "Hipo");
        ZooAnimal elephant = new ZooAnimal(15, "Laura");

        animal.put(lion, lion.getAge());
        animal.put(giraffe, giraffe.getAge());
        animal.put(wolf, wolf.getAge());
        animal.put(hippopotamus, hippopotamus.getAge());
        animal.put(elephant, elephant.getAge());

        System.out.println("The implementation output values TreeMap with entrySet:");
        for (Map.Entry entry : animal.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("The implementation output values TreeMap with keySet:");
        for (ZooAnimal key : animal.keySet()) {
            System.out.println(key + " - " + animal.get(key));
        }
    }
}
