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
		String risposta;
		do {
			do {
				pos=r.nextInt(40);		//da 0 a 39
			} while (estratte.contains(pos));	//se l'ho già estratta torno indietro
			estratte.add(pos);		//non può essere più estratto
			System.out.println("E' uscito: "+carte.get(pos));
			if(pos>=0 && pos<=6)			//denari
				punteggio+=pos+1;
			else if(pos>=7 && pos<=9)
				punteggio+=0.5f;
			else if(pos>=10 && pos<=16)		//bastoni
				punteggio+=pos+1-10; //-9
			else if(pos>=17 && pos<=19)
				punteggio+=0.5f;
			else if(pos>=20 && pos<=26)		//coppe
				punteggio+=pos+1-20; //-19
			else if(pos>=27 && pos<=29)
				punteggio+=0.5f;
			else if(pos>=30 && pos<=36)		//spade
				punteggio+=pos+1-30; //-29
			else if(pos>=37 && pos<=39)
				punteggio+=0.5f;
			
			System.out.println("Punteggio: "+punteggio);
			System.out.println("\nVuoi continuare (s/n)");
			risposta=sc.nextLine();
		} while(risposta.equals("s"));
		
	}

}
