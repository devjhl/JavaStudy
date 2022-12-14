package example.product;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

@Data
public class Product implements Serializable{
	private static final long serialVersionUID = -8890158466573717153L;
	private String Classification; //분류
	private String productName; //제품명
	private int Quantity; //수량
	private int purchasePrice; //구매가격
	private int sellingPrice; //판매가격
	
	public Product(String classification, String productName, int quantity, int purchasePrice, int sellingPrice) {
		this.Classification = classification;
		this.productName = productName;
		this.Quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}
	//구매 판매
	public Product(String productName) {
		this.productName = productName;
	}
	
	
	public void purchaseProduct(int Quantity) {
		if(Quantity == 0)
			return ;
		this.Quantity += Quantity;
	}
	
	
	@Override
	public String toString() {
			return "분류 : " + Classification + " 제품명 : " + productName + " 수량 : " + Quantity
					+ " 구매가격 : " + purchasePrice + " 판매가격 : " + sellingPrice;
	}
	
	

	
	public void updateProduct(String classification, String productName, int quantity) {
		this.Classification = classification;
		this.productName = productName;
		this.Quantity = quantity;
	}
	
	
	
	public String getMoney1( ) {
		DecimalFormat df = new DecimalFormat("###,###"); 
		return df.format(purchasePrice);
	}
	public String getMoney2( ) {
		DecimalFormat df = new DecimalFormat("###,###"); 
		return df.format(sellingPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName);
	}
	@Override
	public int hashCode() {
		return Objects.hash(productName);
	}
}
