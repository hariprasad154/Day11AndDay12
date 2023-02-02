package Com.BridgeLabs;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Com.BridgeLabs.Stock;
public class StockPortfolio {
	List<Stock> Stocklist=new ArrayList<>();

	HashMap<String, Double> hashMap = new HashMap<String, Double>();

	//Taking Stock Details


	static double ToatalValue=0;
	
//	static void demo() {
//		
//		
//	}
//	void demo2() {
//		
//	}

	void stockDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("enter the Number Of Stocks : ");
		int numberOfStock = scanner.nextInt();

		for (int i = 1; i <= numberOfStock; i++) {
//			System.out.print("Enter The Stock Name : ");
//			String stockName = scanner.nextLine();
			
			System.out.print("Enter The Share Name : ");
			
			String ShareName = scanner.next();

			System.out.print("No.of Shares : ");
			int numberOfShares = scanner.nextInt();
			
			System.out.print("Share Price : ");
			double sharePrice = scanner.nextDouble();
			
			double total = numberOfShares * sharePrice;
			ToatalValue+=total;


			Stock stock=new Stock(ShareName,numberOfShares,sharePrice,total);
			//eachStockCalculate(stockName, numberOfStock, sharePrice);
			//            System.out.println(totalStock);
			//            System.out.println(totalStock);
			//            System.out.println(totalStock);
			Stocklist.add(stock);

		}
		
		
		
		
	}
	Stock stock =new Stock(ToatalValue);

void showReport() {
	System.out.println(stock.getNumberOfStock());
	stock.setTotalStock(ToatalValue);
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
	for (Stock i : Stocklist) {
		System.out.println("The ShareName -"+i.getShareName());
		System.out.println("Number of Shares -"+i.getNumberOfShares());
		System.out.println("The share Price -"+i.getSharePrice());
		System.out.println("the total Share Value -"+i.getTotal());
		System.out.println("---------------");
		
	}
	
	System.out.println("The total stocks value "+stock.getTotalStock());
	
}
	
	
	
}







