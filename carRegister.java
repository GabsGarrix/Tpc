package com.ronaldogabriela;

import java.util.HashSet;
import java.util.Set;

public class carRegister {
    private Set<String> permit;
    private Set<String> parked;
    private int capacity;

    carRegister(int capacity){
        this.permit = new HashSet<>();
        this.parked = new HashSet<>();
        this.capacity =capacity;
    }
    public boolean givePermit(String e){
        if (this.permit.contains(e)){
            return false;
        }
        else {
            permit.add(e);
            return true;
        }
    }
    public boolean recordParking(String e){
        if ((this.capacity < parked.size()) && (permit.contains(e))){
                parked.add(e);
                return true;
    }
        else
            return false;
    }

    public boolean recordExit(String e){
        if (parked.contains(e)){
            return true;
        }
        else
            return  false;
    }
    public boolean isParked(String e){
        if (parked.contains(e)){
            return true;
        }
        else return false;
    }
    public boolean isFull(){
        if (this.capacity > parked.size())
            return false;
        else return true;
    }
    public int numberParked(){
        return parked.size();
    }
    public Set<String> getPermit(){
        return permit;
    }


    public Set<String> getParked(){
        return parked;
    }
    public int getCapacity(){
        return this.capacity;
    }

}
