package ra;

import java.util.Map;

public class Student {
    int id;
    String name;
    int age;
    boolean sex;
    double dtb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSex() {
        return sex;
    }

    public Student(int id, String name, int age, boolean sex, double dtb) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dtb = dtb;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Map.Entry<String, Integer> entry) {
        this.name = entry.getKey();
        this.age=entry.getValue();
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", dtb=" + dtb +
                '}';
    }
}
