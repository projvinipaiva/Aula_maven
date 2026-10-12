package application;

import dominio.Pessoa;

public class Programa {

    public static void main(String[] args){

        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "calors@gmail.com");
        Pessoa p2 = new Pessoa(2, "Vinícius da Silva", "vinicius@gmail.com");
        Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
