package com.company;

public class Main {

    public static void main(String[] args) {

            Dog d1 = new Dog();
            d1.setName("Rex");
            d1.setBread("Pittbul");
            d1.setColor(Color.BLACK);
            d1.setAge(3);
            String[] commands = {"Голос", "сидеть", "лежать"};
            d1.setCommands(commands);
            Shelter sh1 = new Shelter("Pet Paradise", "st.1 15h");
            d1.setShelter(sh1);
            System.out.println(d1.getInfo());
            d1.makeVoice();
            //
            Shelter sh2 = new Shelter("PetHome", "st.13 14h");
            Dog d2 = new Dog("Rex", "Haski", Color.BLACK, sh2);
            System.out.println(d2.getInfo());
            d2.makeVoice("Gav Gav");
            //
            Shelter sh3 = new Shelter("Budka", "st.16 17h");

            Dog d3 = new Dog("Sharik", "Dvornyga", Color.GRAY, sh3, commands);

            System.out.println(d3.getInfo());
            d3.makeVoice("Gav-gav", 3);

        }
    }


