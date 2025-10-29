package ui;

import java.util.Scanner;

import model.Controller;

public class Executable {
	private Scanner keyboardReader;
	private Controller controller;

	public static void main(String[] args) {

		System.out.println("Welcome to Surtimerca");
		Executable exe = new Executable();
		exe.showMenu();

	}

	public Executable() {
		keyboardReader = new Scanner(System.in);
		controller = new Controller();
	}

	public void showMenu() {

		int option = 0;

		do {

			System.out.println("MAIN MENU");
			System.out.println(
					"Please pick an option\n" +
							"(1) Load products from file\n" +
							"(2) Register a product\n" +
							"(3) Show product list \n" +
							"(4) Save products \n" +
							"(5) Load products \n" +
							"(0) To close the application");
			option = keyboardReader.nextInt();

			switch (option) {
				case 0:
					System.out.println("Thanks for using our services!");
					break;
				case 1:
					loadProductsFromFile();
					break;
				case 2:
					registerProduct();
					break;
				case 3:
					System.out.println(controller.showProductList());
					break;
				case 4:
					System.out.println(controller.saveProducts());
					break;
				case 5:
					System.out.println(controller.loadProducts());
					break;
				case 6:
					// Add all cases necessary for new requirements
					break;
				default:
					System.out.println("Error, type a valid option");

			}

		} while (option != 0);

	}

	public void loadProductsFromFile() {

		keyboardReader.nextLine();

		System.out.println("CARGA DE PRODUCTOS DESDE UN ARCHIVO DE TEXTO");

		System.out.println("Proporcione la ruta del archivo");
		String filePath = keyboardReader.nextLine();

		System.out.println(controller.loadProductsFromTextFile(filePath));

	}

	public void registerProduct() {

		keyboardReader.nextLine();

		System.out.println("REGISTRO DE UN NUEVO PRODUCTO");

		System.out.println("Digite el nombre del producto");
		String name = keyboardReader.nextLine();

		System.out.println("Digite el precio del producto");
		double price = keyboardReader.nextDouble();

		System.out.println("Digite las unidades disponibles del producto");
		int units = keyboardReader.nextInt();

		if (controller.registerProduct(name, price, units)) {
			System.out.println("Producto registrado exitosamente");
		} else {
			System.out.println("Error, el producto no se pudo registrar");
		}

	}

}