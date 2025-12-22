/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jureny;

/**
 *
 * @author juren
 */
import java.util.Scanner;
public class Jureny {
  public static void main(String[] args) {

        double total_HT = 0;
        double TVA;
        double remise = 0;
        double net_a_paye;

        Scanner scanner = new Scanner(System.in);

        
        String[] produits = {"Riz (par kilo)", "Sucre (par kilo)", "Huile (par litre)", "Sac (par piece)", "Savon (par piece)","Lotion (par piece)","Haricot (par kilo"};
        double[] prixProduits = {0.5, 1.0, 0.5, 10.0, 3.0, 3.0,2.0};

        System.out.println("Bienvenu(s) dans notre systeme de facture");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre numero de telephone: ");
        String numero = scanner.nextLine();

        System.out.print("Entrez le nombre d'article que vous voulez acheter: ");
        int nb_article = scanner.nextInt();

        int[] choixProduit = new int[nb_article];
        int[] quantite = new int[nb_article];

        
        System.out.println("\n-----LISTE DES PRODUITS DISPONIBLES -----");
        for (int i = 0; i < produits.length; i++) {
            System.out.println((i + 1) + ". " + produits[i] + " - " + prixProduits[i] + " USD");
        }
        for (int i = 0; i < nb_article; i++) {
             int choix;
            do {
            System.out.print("\nChoisissez le produit " + (i + 1) +" : ");
             choix = scanner.nextInt();
            } while (choix < 1 || choix > produits.length);

            choixProduit[i] = choix - 1;
            do {
            System.out.print("Entrez la quantite : ");
            quantite[i] = scanner.nextInt();} while (quantite[i] <= 0);
            total_HT += quantite[i] * prixProduits[choixProduit[i]];
        }

        
        TVA = total_HT * 0.16;
        if (total_HT > 100) {
            remise = total_HT * 0.30;
        }
        net_a_paye = total_HT + TVA - remise;

        
        System.out.println("\n----------------------------------------------");
        System.out.println("                  FACTURE                  ");
        System.out.println("----------------------------------------------");
        System.out.println("Client: " + nom);
        System.out.println("Telephone: " + numero + "\n");

        System.out.printf("%-20s %-20s %-10s \n", "Produit", "Quantite", "Prix");
        for (int i = 0; i < nb_article; i++) {
            System.out.printf("%-20s %-20d %-10.2f\n",produits[choixProduit[i]],quantite[i],prixProduits[choixProduit[i]]);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("Total HT: %.2f USD\n", total_HT);
        System.out.printf("TVA (16%%): %.2f USD\n", TVA);
        System.out.printf("Remise: %.2f USD\n", remise);
        System.out.printf("Net a payer: %.2f USD\n", net_a_paye);
        System.out.println("================================================");
    }
}
