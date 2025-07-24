package org.desafios;

import java.util.Scanner;

public class ValidarLoginSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loginValido = false;
        String login;
        String senha;

        do {
            System.out.println("Digite o login:");
            login = scanner.nextLine();

            System.out.println("Digite a senha:");
            senha = scanner.nextLine();

            if (login.equalsIgnoreCase(senha)) {
                System.out.println("Login e senha não podem ser iguais.");
            } else {
                loginValido = true;
                System.out.println("Login e senha válidos.");
            }
        } while (!loginValido);
    }
}