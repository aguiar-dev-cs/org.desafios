package org.desafios.petwashmachine;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("====== MENU ====");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Adicionar água");
            System.out.println("3. Adicionar shampoo");
            System.out.println("4. Verificar água");
            System.out.println("5. Verificar shampoo");
            System.out.println("6. Verificar se tem pet na máquina");
            System.out.println("7. Adicionar pet");
            System.out.println("8. Remover pet");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
    }

    private static void setWater() {
        System.out.println("Colocando água na máquina...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Colocando shampoo na máquina...");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("Quantidade de água na máquina: " + amount);
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("Quantidade de shampoo na máquina: " + amount);
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println("Tem pet na máquina? " + (hasPet ? "Sim" : "Não"));
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Digite o nome do pet:");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);

    }
}