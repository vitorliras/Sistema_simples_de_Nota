package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Note;



public class Main {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Note note = new Note();
		
		System.out.println("Name: ");
		note.Name = sc.nextLine();
		
		System.out.println("First note: ");
		note.a = sc.nextDouble();
		System.out.println("Second note: ");
		note.b = sc.nextDouble();
		System.out.println("third note: ");
		note.c = sc.nextDouble();
		System.out.println("fourth note: ");
		note.d = sc.nextDouble() ;
		
		
		
		
		note.noteFinal();
		System.out.println(note);
		
		
				
		
		
	}

}
