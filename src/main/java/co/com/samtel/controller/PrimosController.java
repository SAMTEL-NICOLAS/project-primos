package co.com.samtel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.bussines.IPrimosService;

@Controller
@RestController
@RequestMapping("/v.1/primos")
public class PrimosController {
	
	@Autowired
	IPrimosService primosService;
	/**
	 * Metodo con el cual encuentro un rango de numeros primos
	 * @param maximo
	 * @return
	 */
	@GetMapping(value= "/{maximo}")
	public ResponseEntity<List<Long>> getPrimos(@PathVariable(value="maximo", required=true) Long maximo){
		return new ResponseEntity<>(primosService.generarPrimos(maximo), HttpStatus.OK);
	}
	
	@GetMapping(value= "/isPrime/{number}")
	public ResponseEntity<Boolean> getPrime(@PathVariable(value="number", required=true) Long number){
		return new ResponseEntity<>(primosService.isNumberPrimo(number), HttpStatus.OK);
	}
	
	@GetMapping(value= "/isPrimeWhy/{number}")
	public ResponseEntity<Long> getPrimeWhy(@PathVariable(value="number", required=true) Long number){
		return new ResponseEntity<>(primosService.isNumberPrimoWhy(number), HttpStatus.OK);
	}
	
}
