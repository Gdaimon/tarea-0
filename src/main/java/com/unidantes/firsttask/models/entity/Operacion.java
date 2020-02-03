package com.unidantes.firsttask.models.entity;


public class Operacion {
	Double numeroA;
	Double numeroB;
	Double resultado;
	Boolean visible;
	
	
	public Double getNumeroA ( ) {
		return numeroA;
	}
	
	public void setNumeroA ( Double numeroA ) {
		this.numeroA = numeroA;
	}
	
	public Double getNumeroB ( ) {
		return numeroB;
	}
	
	public void setNumeroB ( Double numeroB ) {
		this.numeroB = numeroB;
	}
	
	public Double getResultado ( ) {
		return resultado;
	}
	
	public void setResultado ( Double resultado ) {
		this.resultado = resultado;
	}
	
	public Boolean getVisible ( ) {
		return visible;
	}
	
	public void setVisible ( Boolean visible ) {
		this.visible = visible;
	}
}
