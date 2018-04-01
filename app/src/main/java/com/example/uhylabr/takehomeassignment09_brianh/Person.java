package com.example.uhylabr.takehomeassignment09_brianh;

/**
 * Created by UHYLABR on 3/29/2018.
 */

public class Person {
    private String Name;
    private int Age;
    private boolean GradHS;
    private boolean GotDiploma;

    public Person(){}

    public Person(String name, int age, boolean gradHS, boolean gotDiploma) {
        Name = name;
        Age = age;
        GradHS = gradHS;
        GotDiploma = gotDiploma;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isGradHS() {
        return GradHS;
    }

    public void setGradHS(boolean gradHS) {
        GradHS = gradHS;
    }

    public boolean isGotDiploma(){return GotDiploma;}

    public void setGotDiploma(boolean gotDiploma){GotDiploma = gotDiploma;}


}
