package org.desafios.petwashmachine;

public class PetMachine {

    private boolean clean = true;

    private int water = 30; // Capacidade máxima de água

    private int shampoo = 10; // Capacidade máxima de shampoo

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina primeiro.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " tomou banho.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A máquina já está cheia de água.");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A máquina já está cheia de shampoo.");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina não está limpa. Limpe a máquina antes de adicionar um pet.");
            return;
        }
        if (hasPet()) {
            System.out.println("Pet " + pet.getName() + " adicionado à máquina.");
            return;
        }
        this.pet = pet;
        System.out.println("Pet " + pet.getName() + " adicionado à máquina.");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi removido da máquina.");
        this.pet = null;
    }
    public void washMachine() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina foi lavada e está pronta para uso.");
    }
}
