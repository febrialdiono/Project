
package com.dicoding.javafundamental.game;


public class User {
    public static void main(String[] args) {
        Game tarekses = new Game();
        tarekses.name = "luki";
        tarekses.speed = 389;
        tarekses.healthPoin = 0;
        
        tarekses.run();
        if (tarekses.mati()){
            System.out.println("Mau ngapain");
        }
    }
}
