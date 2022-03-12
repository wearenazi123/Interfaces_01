package com.company;

public class Stringed  implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this+".play()"+n);
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }
    public String toString(){return "Stringed";}
}
