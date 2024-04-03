package model;

public class Cat {
    private String name;
    private Gender gender;
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", gender=" + gender + ", age=" + age + ", color='" + color + '\'' + '}';
    }
}
