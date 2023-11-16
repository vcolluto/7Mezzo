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
			
		

	}

}
