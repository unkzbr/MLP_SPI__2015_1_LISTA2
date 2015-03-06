package Datas;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	int dia = read.nextInt(),mes = read.nextInt(),ano = read.nextInt();
	Data d = new Data(dia,mes,ano);
	
	read.close();
	if(d.isValida()) { System.out.println(d);}
	
	
	
	}
}
