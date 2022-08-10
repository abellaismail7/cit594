package edu.upenn.cit594;

import edu.upenn.cit594.ui.Menu;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		Console cnsl = System.console();
		if (cnsl == null) {
			System.err.println("No console available");
			return;
		}
		while (true) {
			String str = cnsl.readLine("> ");
			if (str == null)
				break;

			if (!menu.exec_line(str))
				break;
		}
	}
}
