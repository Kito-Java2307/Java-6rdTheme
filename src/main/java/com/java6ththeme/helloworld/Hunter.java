package com.java6ththeme.helloworld;

import java.util.List;

public class Hunter {
    private String name;
    private int age;
    private List<String> attackNames;

    public Hunter(String name, int age, List<String> attackNames) {
        this.name = name;
        this.age = age;
        this.attackNames = attackNames;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public List<String> getAttackNames() { return this.attackNames; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAttackNames(List<String> attackNames) { this.attackNames = attackNames; }

}
