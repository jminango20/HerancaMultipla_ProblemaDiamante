package application;

import devices.Printer;
import devices.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

	}

}
