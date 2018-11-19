package co.com.samtel.bussines;

import java.util.List;

public interface IPrimosService {
	
	public List<Long> generarPrimos(Long numeroMaximo);
	
	public Boolean isNumberPrimo(Long numero);
	 
	public long isNumberPrimoWhy(Long numero);

}
