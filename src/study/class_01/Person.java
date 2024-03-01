package study.class_01;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private int gender;
    private String[] hobby;

    // 아무것도 입력받지 않는 생성자
    public Person() {
    }

    // 4개 변수에 대한 getter/setter
    public Person(String name, int age, int gender, String[] hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String sex;
        if (gender == 0) {
            sex = "man";
        } else if(gender == 1) {
            sex = "woman";
        } else {
            sex = "trans";
        }
        return "\nstudy.class_01.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + sex +
                ", hobby=" + Arrays.toString(hobby) +
                "}";
    }

    public void presentSelf() {
        System.out.println(toString());
    }
}
