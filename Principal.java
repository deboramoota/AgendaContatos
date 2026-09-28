package br.edu.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Principal {
	 public static void main(String[] args) {
		 String nome ="Fulano";
		 String celular="85999999999";
		 String email = "fulano@email.com";
		 
		 try {
			 PrintWriter pw = new PrintWriter(new FileWriter("arquivo.txt"));
			 pw.println(nome + ";" + celular + ";" + email);
			 pw.close();
		 }catch (IOException ex) {
			 System.out.println("Erro ao escrever no arquivo!");
		 }
	 }
 }
