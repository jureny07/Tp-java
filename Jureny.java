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
        double total_HT =0;
        double TVA;
        double remise=0;
        double net_a_paye;
        
        Scanner scanner = new Scanner(System.in);   
        
        System.out.println("Bienvenu(s) dans notre systeme de facture");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre numero de telephone: ");
        String numero = scanner.nextLine();
        System.out.print("Entrez le nombre d'article que vous voulez achete: ");
        int nb_article= scanner.nextInt() ;
        scanner.nextLine();
        
        String[] nom_article = new String[nb_article];
        int[] quantite = new int[nb_article];
        double [] prix = new double[nb_article];
        
        System.out.println("Entrez les noms des articles");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<nb_article;i++){
            
            System.out.print((i+1) + ". ");
            nom_article[i] = scanner.nextLine();
        }
        System.out.println("Entrez la quantite des articles");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<nb_article;i++){
           
            System.out.print((i+1) + ". ");
            quantite[i] = scanner.nextInt();
        }
        System.out.println("Entrez le prix unitaire des produits (USD)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<nb_article;i++){
            System.out.print((i+1) + ". ");
            prix[i] = scanner.nextDouble();
        }
        for(int i=0;i<nb_article;i++){
            total_HT += quantite[i] * prix[i];
        }
        TVA=total_HT*0.16;
        if(total_HT>100){
            remise =total_HT*0.30;
        }
        net_a_paye=total_HT+TVA-remise;
        
        System.out.println("=========================FACTURE=================================");
        System.out.println("Client: "+nom);
        System.out.println("Numero de telephone: "+numero+"\n");
        System.out.println("Nom article          Quantite          Prix(USD)");
        for(int i=0;i<nb_article;i++){
            System.out.println(nom_article[i]+"          "+quantite[i]+"          "+prix[i]);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("\nTotal Hors Taxe: "+total_HT+" USD");
        System.out.println("Motant de la TVA: "+TVA+" USD");
        System.out.println("Motant de la remise apliquee: "+remise+" USD");
        System.out.println("Net a payer: "+net_a_paye+" USD");
        System.out.println("------------------------------------------------------------------");
        
            
            
        
        
               
        
     
    }
}
