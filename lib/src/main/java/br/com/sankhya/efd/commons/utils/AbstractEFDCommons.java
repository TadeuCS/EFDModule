package br.com.sankhya.efd.commons.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.sankhya.efd.commons.models.Registro0000;
import br.com.sankhya.efd.commons.models.RegistroC100;

public abstract class AbstractEFDCommons implements IEFDProcessor, IEFDGenerator  {
	public List<Registro0000> registros0000;
	public List<RegistroC100> registrosC100;
	public AbstractEFDCommons() {
		registros0000=new ArrayList<>();
		registrosC100=new ArrayList<>();
	}
	
	// Eventos Comuns
		public abstract void processar();

		public abstract void gerar();

}
