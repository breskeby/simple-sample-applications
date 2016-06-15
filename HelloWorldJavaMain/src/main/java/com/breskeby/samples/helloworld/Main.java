package com.breskeby.samples.helloworld;

public class Main {
    public static void main(String... args){
        if(args.length == 0) {
            System.out.println ("Hello Stranger!");
        } else if (args.length == 1) {
            System.out.println ("Hello " + args[0] + "!");
        } else{
            System.out.println ("Hello folks!");
        }
    }
}
