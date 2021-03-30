package com.company;

public class Dog extends Animal {
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    int legs = 4;
    String voice = "woof";
    public Dog(){
    }

    @Override
    public String talk() {
        return voice;
    }
}
