package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String bread;
    private String[] commands;

    public Dog() {
    }
     public Dog(String name, String bread, Color color, Shelter shelter ){
        this.name = name;
        this.bread = bread;
        this.setColor(color);
        this.setShelter(shelter);
     }

     public Dog(String name, String bread, Color color, Shelter shelter, String[] commands){
        this.name = name;
        this.bread = bread;
        this.setShelter(shelter);
        this.setColor(color);
        this.commands = commands;
     }


     void makeVoice(){
         System.out.println("Tyav-Tyav");
     }

     void makeVoice(String voice){
         System.out.println(voice);
     }

     void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
     }



     public String getInfo(){
        return "Name = " + getName()+ " " + "Bread =  " + getBread()+ " " + "Commands = " + Arrays.toString(getCommands())  + super.getInfo() ;
     }










    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
