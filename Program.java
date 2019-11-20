package ua.univer.shop;

public class Program {

	public static void main(String[] args) {

		Product[] masProduct = new Product[10];
		masProduct[0] = new Product("фрукты", "яблоки", (float) 1, (short) 8);
		masProduct[1] = new Product("фрукты", "яблоки", (float) 1, (short) 5);
		masProduct[2] = new Product("фрукты", "яблоки", (float) 1, (short) 10);
		masProduct[3] = new Product("техника", "телефон", (float) 0.15, (short) 1115);
		masProduct[4] = new Product("техника", "ноутбук", (float) 3.0, (short) 4555);
		masProduct[5] = new Product("техника", "планшет", (float) 1.5, (short) 2885);
		masProduct[6] = new Product("овощи", "бананы", (float) 1, (short) 3);
		masProduct[7] = new Product("овощи", "бананы", (float) 1, (short) 20);
		masProduct[8] = new Product("бытовая химия", "средство для посуды", (float) 0.5, (short) 20);
		masProduct[9] = new Product("бытовая химия", "порошок стеральный", (float) 3.0, (short) 200);
//Task1
		/* Найти с максимальным весом с ценой менее 10 грн */
		Product maxWeightCheepProduct = masProduct[0];
		for (int i = 0; i < masProduct.length; i++) {
			if (masProduct[i].price < 10) {
				if (maxWeightCheepProduct.price > masProduct[i].price) {
					maxWeightCheepProduct = masProduct[i];
				}
			}
		}
		System.out.println(maxWeightCheepProduct);

//Task2
		/* Найти с максимальной ценой весом 3 кг */
		Product maxPriceThreeKGOfProduct = masProduct[0];
		for (int i = 0; i < masProduct.length; i++) {
			if (masProduct[i].weight == 3) {
				if (maxPriceThreeKGOfProduct.price < masProduct[i].price) {
					maxPriceThreeKGOfProduct = masProduct[i];
				}
			}
		}
		System.out.println(maxPriceThreeKGOfProduct);

//Task3
		/* Найти с общий вес всех продуктов */
		float allWeight = 0;
		for (int i = 0; i < masProduct.length; i++) {
			allWeight += masProduct[i].weight;
		}
		System.out.println("allWeight = " + allWeight + "kg");

//Task4
		/* Найти с общую стоимость всех продуктов */
		short allPrice = 0;
		for (int i = 0; i < masProduct.length; i++) {
			allPrice += masProduct[i].price;
		}
		System.out.println("allPrice = " + allPrice + "UAH");

//Task5
		/* Найти все яблоки */
		String allApples = new String("яблоки");
		for (int i = 0; i < masProduct.length; i++) {
			if (allApples.equals(masProduct[i].name)) {
				System.out.println(masProduct[i]);
			}
		}

//Task6
		/* Найти яблоки с максимальной ценой */
		String allPriceApples = new String("яблоки");
		short maxPrice = 0;
		for (int i = 0; i < masProduct.length; i++) {
			if (allApples.equals(masProduct[i].name)) {
				maxPrice = masProduct[i].price;
				if (maxPrice < masProduct[i].price) {
					maxPrice = masProduct[i].price;
				}
			}
		}
		System.out.println("maxPriceOfApples = " + maxPrice);

//Task7
		/* Найти всю технику */
		String allTechnics = new String("техника");
		for (int i = 0; i < masProduct.length; i++) {
			if (allTechnics.equals(masProduct[i].type)) {
				System.out.println(masProduct[i]);
			}
		}

//Task8
		/* Найти среднюю стоимость овощей */
		String allVegetables = new String("овощи");
		short sumPrice = 0;
		short count = 0;
		for (int i = 0; i < masProduct.length; i++) {
			if (allVegetables.equals(masProduct[i].type)) {
				sumPrice += masProduct[i].price;
				count++;
			}
		}
		short middlePrice = (short) (sumPrice / count);
		System.out.println("middlePrice = " + middlePrice);

	} 

}
