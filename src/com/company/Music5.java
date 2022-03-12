package com.company;

public class Music5 {
    static void tune(Instrument i){
        i.play(Note.MIDDL_C);
    }
    static void tuneAll(Instrument[] e){
        for (Instrument i:e){
            tune(i);
        }
    }
}
