package org.example;

/**
 * @author serge kibala
 * classe utilisee lors de notre exercice
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Dam_Test_Cilindre1 dam_test_cilindre1 = new Dam_Test_Cilindre1();
        dam_test_cilindre1.setMatiere("bois");
        double volume= dam_test_cilindre1.getVolume(10.5d, 20.5d);
        System.out.println("le volume du Cilindre est :" + volume);

    }
}