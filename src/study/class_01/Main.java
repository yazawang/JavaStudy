package study.class_01;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("yaza", 3, 0, new String[] {"h", "q", "df"});
        p1.presentSelf();

        ClassRoom c1 = new ClassRoom(1, new ArrayList<>());
        c1.addStudent(new Person("yaza", 3, 0, new String[] {"a", "b", "c"}));
        c1.addStudent(new Person("king", 5, 1, new String[] {"d", "e", "f"}));
        c1.addStudent(new Person("yaja", 5, 2, new String[] {"g", "h", "i"}));
        c1.addStudent(new Person("wang", 5, 3, new String[] {"j", "k", "l"}));

        System.out.println(c1.toString());
    }
}