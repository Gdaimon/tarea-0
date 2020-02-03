package com.unidantes.firsttask.models.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OperadorDaoImpl implements IOperadorDao {
	
	@Override
	public Double sumar ( Double numeroA, Double numeroB ) {
		Double numeroATemp;
		Double numeroBTemp;
		Double resultado;
		
		if ( numeroA == null ) {
			numeroATemp = 0d;
		} else {
			numeroATemp = numeroA;
		}
		
		if ( numeroB == null ) {
			numeroBTemp = 0d;
		} else {
			numeroBTemp = numeroB;
		}
		resultado = numeroATemp + numeroBTemp;
		
		return resultado;
	}
	
	@Override
	public Double resta ( Double numeroA, Double numeroB ) {
		Double numeroATemp;
		Double numeroBTemp;
		Double resultado;
		
		if ( numeroA == null ) {
			numeroATemp = 0d;
		} else {
			numeroATemp = numeroA;
		}
		
		if ( numeroB == null ) {
			numeroBTemp = 0d;
		} else {
			numeroBTemp = numeroB;
		}
		resultado = numeroATemp - numeroBTemp;
		
		return resultado;
	}
	
	@Override
	public Double potencias ( Double numeroA, Double numeroB ) {
		Double numeroATemp;
		Double numeroBTemp;
		Double resultado;
		
		if ( numeroA == null ) {
			numeroATemp = 0d;
		} else {
			numeroATemp = numeroA;
		}
		
		if ( numeroB == null ) {
			numeroBTemp = 0d;
		} else {
			numeroBTemp = numeroB;
		}
		resultado = numeroATemp + numeroBTemp;
		
		for ( int numero = 0; numero <= numeroBTemp; ++numero ) {
			if ( numero == 0 ) {
				resultado = numeroATemp;
			} else if ( numero == 1 ) {
				resultado = numeroATemp;
			} else {
				resultado *= numeroATemp;
			}
			
		}
		
		return resultado;
	}
}
