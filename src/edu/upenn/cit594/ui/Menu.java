package edu.upenn.cit594.ui;

public class Menu {

	public void show_data() {
		// todo
		System.out.println("show data");
	}

	public void total_population() {
		// todo
		System.out.println("total population");
	}

	public void total_vacination_per_capita() {
		// todo
		System.out.println("total vacination per capita");
	}

	public void average_market_value() {
		// todo
		System.out.println("average market value");
	}

	public void average_total_livable_area() {
		// todo
		System.out.println("average total livable area");
	}

	public void total_market_value() {
		// todo
		System.out.println("total market value");
	}

	public Boolean exec_line(String line) {
		if (line == "0")
			return false;
		System.out.println("BEGIN OUTPUT");
		switch (line) {
			case "1":
				show_data();
				break;
			case "2":
				total_population();
				break;
			case "3":
				total_vacination_per_capita();
				break;
			case "4":
				average_market_value();
				break;
			case "5":
				average_total_livable_area();
				break;
			case "6":
				total_market_value();
				break;
			case "7":
				// todo
				break;
			default:
				System.err.println(line + " is not a valid command");
				break;

		}
		System.out.println("END OUTPUT");

		return true;
	}
}
