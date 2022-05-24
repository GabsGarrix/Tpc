package com.ronaldogabriela;

public class Main {

    public static void main(String[] args) {
	carRegister carro = new carRegister(2);
    carro.givePermit("mustang");
    carro.givePermit("123");
    carro.givePermit("124");
    
        System.out.println(carro.getCapacity());
        System.out.println(carro.recordParking("mustang"));
        System.out.println(carro.isParked("mustang"));;
        System.out.println(carro.isFull());
        System.out.println(carro.getPermit());;
    }
}
