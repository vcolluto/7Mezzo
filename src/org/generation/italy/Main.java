package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> carte=new ArrayList<>();		//elenco di tutte le carte
		HashSet<Integer> estratte=new HashSet<>();		//elenco delle posizioni estratte
		String[] semi= {"denari", "bastoni", "coppe", "spade"};
		float punteggio=0;
		
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		//genero le carte 
		for (int s=0;s<4;s++)
			for (int i=1;i<=10;i++)
				carte.add(i+" di "+semi[s]);
			
		//estrazione di una carta
		int pos;
		String risposta="";
		do {
			do {
				pos=r.nextInt(40);		//da 0 a 39
			} while (estratte.contains(pos));	//se l'ho gi� estratta torno indietro
			estratte.add(pos);		//non pu� essere pi� estratto
			System.out.println("E' uscito: "+carte.get(pos));
			
			pos=pos%10;		//ho sempre un valore da 0 a 9 (ad es. se pos vale 23 => 3)
			if (pos<7)
				punteggio+=pos+1;
			else
				punteggio+=0.5f;
			
			System.out.println("Punteggio: "+punteggio);
			if (punteggio>7.5f)
				System.out.println("Hai sballato!");
			else if (punteggio<7.5f) {
				System.out.println("\nVuoi continuare (s/n)");
				risposta=sc.nextLine();	
			}
			
		} while(risposta.equals("s") && punteggio<7.5);
		System.out.println("Grazie e arrivederci!");
		sc.close();
	}

}
