package application;

import entities.Persons;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Persons persons;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Persons[] vet = new Persons[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vet[i] = new Persons(name, age, height);
        }

        //Cálculo média
        double sum = 0.0;
        double media = 0.0;
        for (int i = 0; i < vet.length; i++) {
            sum += vet[i].getHeight();
        }
        media = sum / vet.length;
        System.out.println("Altura media: " + media);

        //Porcentagem de pessoas menores de 16
        int under = 0;

        for (int i=0; i<vet.length; i++) {
            if (vet[i].getAge() < 16) {
                under += 1;
                System.out.printf("Pessoa %d menor que 16: " + vet[i].getName() + "%n", i);
            }
        }
        double percentage = under * 100.0 / vet.length;
        System.out.println("Porcentagem dos menores que 16: " + percentage + "%");

        sc.close();
    }
}