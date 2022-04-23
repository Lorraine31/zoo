package com.company;

public class Zoologico {

    public static void  main(String args[]) {
        Animal animal = new Animal("urso");

//        animal.especie = "urso";
        animal.idade = 12;
        animal.peso = 80.00;
        animal.tipoAlimentacao = "Carnivoro";
        animal.tipoLocomocao = "Anda";
        animal.peso = 1.80;

        System.out.println("Tipo de animal " + animal.especie);
        animal.comer();
        animal.dormir();

        Animal animal2 = new Animal();
        animal2.especie = "pinguim";
        animal.idade = 3;
        animal.peso = 5.00;
        animal.tipoAlimentacao = "Onivoro";
        animal.tipoLocomocao = "Anda e nada";
        animal.peso = 0.60;

        System.out.println("Tipo de animal " + animal2.especie);
        animal2.comer();
        animal2.dormir();

        Pato pato = new Pato();
        pato.comer();

        Animal animalPato = new Pato(); //um pato sempre sera um animal, mas nem htodo animal sera um pato

        animalPato.comer();

        Coelho coelho = new Coelho();

        alimentar(pato);
        alimentar(coelho);
        alimentar(animalPato);
    }
    public static void alimentar(Animal a) {
        a.comer();
    }
}
