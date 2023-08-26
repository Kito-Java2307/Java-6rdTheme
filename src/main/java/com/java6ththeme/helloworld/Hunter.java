package com.java6ththeme.helloworld;

public class Hunter {
    private String name;
    private int age;
    private String attackName;

    public Hunter(String name, int age, String attackName) {
        this.name = name;
        this.age = age;
        this.attackName = attackName;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public String getAttackName() { return this.attackName; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAttackName(String attackName) { this.attackName = attackName; }

}
