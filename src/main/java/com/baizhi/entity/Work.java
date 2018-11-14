package com.baizhi.entity;

public class Work {
    private String id;
    private String name;
    private String salary;
    private Integer age;
    private String bir;
    private String sex;

    public Work() {
    }

    public Work(String id, String name, String salary, Integer age, String bir, String sex) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.bir = bir;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                ", bir='" + bir + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
