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
		
		
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		//genero le carte 
		for (int s=0;s<4;s++)
			for (int i=1;i<=10;i++)
				carte.add(i+" di "+semi[s]);
			
		//estrazione di una carta
		int pos;
		do {
			pos=r.nextInt(40);		//da 0 a 39
		} while (estratte.contains(pos));	//se l'ho già estratta torno indietro
		estratte.add(pos);		//non può essere più estratto
		System.out.println("E' uscito: "+carte.get(pos));
	}

}
