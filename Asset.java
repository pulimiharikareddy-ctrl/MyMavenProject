package com.portfolio.model;

public class Asset
{
	private String Assetid;
	private String Assetname;
	private double Price;
	
	public Asset(String Assetid, String Assetname, double Price)
	{
		this.Assetid=Assetid;
		this.Assetname=Assetname;
		this.Price=Price;
	}

	public String getAssetid() {
		return Assetid;
	}

	public void setAssetid(String assetid) {
		Assetid = assetid;
	}

	public String getAssetname() {
		return Assetname;
	}

	public void setAssetname(String assetname) {
		Assetname = assetname;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
}
