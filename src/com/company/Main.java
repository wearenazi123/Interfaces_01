package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instrument[] orchestra={new Wind(),new Percussion(),new Stringed(),
        new Brass(),new Woodwind()};
        Music5.tuneAll(orchestra);
    }
}
