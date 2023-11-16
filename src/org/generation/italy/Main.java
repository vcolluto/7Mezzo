package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> carte=new ArrayList<>();		//elenco di tutte le carte
		HashSet<Integer> estratte=new HashSet<>();		//elenco delle posizioni estratte
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		//genero le carte di denari			(posizioni da 0..9)
		for (int i=1;i<=10;i++)
			carte.add(i+" di denari");
			
		//genero le carte di bastoni		(posizioni da 10..19)
		for (int i=1;i<=10;i++)
			carte.add(i+" di bastoni");
		
		//genero le carte di coppe			(posizioni da 20..29)
		for (int i=1;i<=10;i++)
			carte.add(i+" di coppe");
		
		//genero le carte di spade			(posizioni da 30..39)
		for (int i=1;i<=10;i++)
			carte.add(i+" di spade");

	}

}
