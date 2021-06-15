package org.a0521;
import org.a0521.Reptile;
public class Demo {
    public Demo() {
    }
    public static void main(String[] args) {
    	Reptile Reptile = new Reptile("short", "crocodile", 0, 140);
        System.out.println("Height: " + Reptile.getHeight());
        System.out.println("animalType Type: " + Reptile.getanimalType());
        System.out.println(Reptile);
    }
}



