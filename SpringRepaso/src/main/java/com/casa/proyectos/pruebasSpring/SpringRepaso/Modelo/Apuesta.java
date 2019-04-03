package com.casa.proyectos.pruebasSpring.SpringRepaso.Modelo;

public class Apuesta {

	private long id;
	private double cuota;
	private String descripcion;
	private Boolean acertada;
	private long id_mercado;

	private Mercado mercado;


	private Apuesta() {

	}
	

	public Apuesta(long id, double cuota, String descripcion, Boolean acertada, Mercado mercado) {
		super();
		this.id = id;
		this.cuota = cuota;
		this.descripcion = descripcion;
		this.acertada = acertada;
		this.mercado = mercado;
	
	}


	public Apuesta(long id, double cuota, String descripcion, Boolean acertada) {
		super();
		this.id = id;
		this.cuota = cuota;
		this.descripcion = descripcion;
		this.acertada = acertada;
	}


	public Apuesta(double cuota, String descripcion, long idmercado) {
		this.cuota = cuota;
		this.descripcion = descripcion;
		this.id_mercado = idmercado;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getAcertada() {
		return acertada;
	}

	public void setAcertada(Boolean acertada) {
		this.acertada = acertada;
	}

	public Mercado getMercado() {
		return mercado;
	}

	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}

	public long getId_mercado() {
		return id_mercado;
	}


	public void setId_mercado(long id_mercado) {
		this.id_mercado = id_mercado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acertada == null) ? 0 : acertada.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cuota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (id_mercado ^ (id_mercado >>> 32));
		result = prime * result + ((mercado == null) ? 0 : mercado.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return "Apuesta [id=" + id + ", cuota=" + cuota + ", descripcion=" + descripcion + ", acertada=" + acertada
				+ ", id_mercado=" + id_mercado + ", mercado=" + mercado + "]";
	}



	
	

}