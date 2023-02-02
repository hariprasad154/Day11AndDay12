package Com.BridgeLabs;

public class Stock {
	private int numberOfStock ;
	private String ShareName ;
	private int numberOfShares ;
	private double sharePrice;
	private double total ;
	private double totalStock ;
	public Stock(String ShareName,int numberOfShares,double sharePrice,double total){
		this.numberOfStock=numberOfStock;
		this.ShareName=ShareName;
		this.numberOfShares=numberOfShares;
		//this.numberOfStock=numberOfStock;
		this.sharePrice=sharePrice;
		this.numberOfStock=numberOfStock;
		this.total=total;
	
	}
	public Stock(double totalStock) {
		
		this.totalStock=totalStock;
	}
	/**
	 * @return the numberOfStock
	 */
	public int getNumberOfStock() {
		return numberOfStock;
	}
	/**
	 * @param numberOfStock the numberOfStock to set
	 */
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	/**
	 * @return the shareName
	 */
	public String getShareName() {
		return ShareName;
	}
	/**
	 * @param shareName the shareName to set
	 */
	public void setShareName(String shareName) {
		ShareName = shareName;
	}
	/**
	 * @return the numberOfShares
	 */
	public double getNumberOfShares() {
		return numberOfShares;
	}
	/**
	 * @param numberOfShares the numberOfShares to set
	 */
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	/**
	 * @return the sharePrice
	 */
	public double getSharePrice() {
		return sharePrice;
	}
	/**
	 * @param sharePrice the sharePrice to set
	 */
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * @return the totalStock
	 */
	public double getTotalStock() {
		return totalStock;
	}
	/**
	 * @param totalStock the totalStock to set
	 */
	public void setTotalStock(double totalStock) {
		this.totalStock = totalStock;
	}
	
	
	

}
