package co.com.samtel.bussines.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.samtel.bussines.IPrimosService;

@Service
public class PrimosService implements IPrimosService{
	/**
	 * Metodo con el cual valido un rango de numeros primos
	 */
	@Override
	public List<Integer> generarPrimos(Integer numeroMaximo) {
		List<Integer> resultado = new ArrayList<>();
		for(int i = 1; i < numeroMaximo ; i++) {
			if(isNumberPrimo(i)) {
				resultado.add(i);
			}
		}
		return resultado;
	}
	/**
	 * Metodo con el cual se evalua si un numero es primo
	 * @param numero
	 * @return
	 */
	private Boolean isNumberPrimo(Integer numero) {
		for(int i = 1; i <= (numero/2) ; i++) {
			if(numero % i == 0 && i != 1 ) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

}
