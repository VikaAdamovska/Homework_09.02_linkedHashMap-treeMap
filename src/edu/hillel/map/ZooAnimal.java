package edu.hillel.map;

import java.util.Objects;

public class ZooAnimal implements Comparable<ZooAnimal> {
    private int age;
    private String name;

    public ZooAnimal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal zooAnimal = (ZooAnimal) o;
        return age == zooAnimal.age &&
                Objects.equals(name, zooAnimal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ZooAnimal o) {
        return name.compareTo(o.getName());
    }
}




