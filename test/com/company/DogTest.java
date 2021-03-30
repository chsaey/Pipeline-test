package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dog = new Dog();
    }

    @org.junit.jupiter.api.Test
    void getLegs() {
        assertEquals(4, dog.getLegs());
    }

    @org.junit.jupiter.api.Test
    void setLegs() {
    }

    @org.junit.jupiter.api.Test
    void getVoice() {
        assertEquals("woof", dog.talk());
    }

    @org.junit.jupiter.api.Test
    void setVoice() {
    }
}