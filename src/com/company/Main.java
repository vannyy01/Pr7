package com.company;

import com.company.workers.Director;
import com.company.workers.Engeneer;
import com.company.workers.Worker;

public class Main {

    public static void main(String[] args) {
        Worker director = new Director("magister", "John Stark Snow", 12, "Director of sales departament", "Sales" ,"26.03.2012");
        director.print();
        Worker engeneer = new Engeneer("specialist", "David James Backham", 10, "Engeneer-constructor", "constructor", 3, 9);
        System.out.println();
        engeneer.print();
    }
}
