package main.java.model;

public class Coche {
	private String marca;
	private String modelo;
	private int cv;
	private double kms;
	private boolean vendido;
	
	public Coche(String marca, String modelo, int cv, double kms, boolean vendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.kms = kms;
		this.vendido = vendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	

}
