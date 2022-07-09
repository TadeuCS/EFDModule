package br.com.sankhya.efd.icmsipi.utils;

import java.util.List;
import java.util.Map;

import br.com.sankhya.efd.commons.utils.AbstractEFDCommons;
import br.com.sankhya.efd.icmsipi.helpers.BuscadorDeDadosNoBancoIcmsIpiHelper;
import br.com.sankhya.efd.icmsipi.helpers.ProcessadorDeParametrosIcmsIpiHelper;
import br.com.sankhya.efd.icmsipi.helpers.ProcessadorDeRegistrosIcmsIpiHelper;
import br.com.sankhya.efd.icmsipi.models.registros.RegistroK100;

public abstract class AbstractIcmsIpiGeneratorEFD extends AbstractEFDCommons {
	protected List<RegistroK100> registrosK100;
	
	protected BuscadorDeDadosNoBancoIcmsIpiHelper buscador;
	protected ProcessadorDeRegistrosIcmsIpiHelper processador;
	private ProcessadorDeParametrosIcmsIpiHelper processadorDeParametros;

	public AbstractIcmsIpiGeneratorEFD(Map<String, Object> parametters) {
		carregarParametros(parametters);		
	}
	
	private void carregarParametros(Map<String, Object> parametters) {
		processadorDeParametros = new ProcessadorDeParametrosIcmsIpiHelper(parametters);
		processadorDeParametros.processar();
	}

}
