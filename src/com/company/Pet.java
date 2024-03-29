package com.company;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;


    private int generateDefaultAge(){
          return 5;
    }

    public String getInfo() {
        return "Age: " + getAge() + " Color: " + getColor()+ " " + " Shelter: " + getShelter().getName()+ " " + getShelter().getAddress();
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
