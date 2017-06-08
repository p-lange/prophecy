package com.peter;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        Prophecy prof = new Prophecy();
        String output;

        Random rand = new Random();
        int match = rand.nextInt(12);
        ProphecyConstruct prophecy = new ProphecyConstruct(match);
        System.out.println("");
        System.out.println(prophecy.getProphecy());

     /*  ProphecyConstruct proph = new ProphecyConstruct(12);
        System.out.println("");
        System.out.println(proph.getProphecy());*/
    }
}
