package com.company;

public class Boss {
    private int health;
    private int damage;
    private String deffenceType;

    public Boss (int health, int damage, String deffenceType){
        this.health = health;
        this.damage = damage;
        this.deffenceType = deffenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDeffenceType() {
        return deffenceType;
    }

    public void setDeffenceType(String deffenceType) {
        this.deffenceType = deffenceType;
    }
}
