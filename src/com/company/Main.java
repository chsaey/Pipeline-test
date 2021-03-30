package com.company;

public class Main {

    public static void main(String[] args) {
	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	dog1.setLegs(3);
	dog2.setVoice("Mooo");
        System.out.println(dog1.getLegs());
        System.out.println(dog2.getVoice());
    }
}
