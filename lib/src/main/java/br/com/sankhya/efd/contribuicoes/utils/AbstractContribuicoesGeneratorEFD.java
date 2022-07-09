package br.com.sankhya.efd.contribuicoes.utils;

import java.util.List;
import java.util.Map;

import br.com.sankhya.efd.commons.utils.AbstractEFDCommons;
import br.com.sankhya.efd.contribuicoes.models.registros.RegistroM100;
import br.com.sankhya.efd.icmsipi.helpers.ProcessadorDeParametrosIcmsIpiHelper;

public abstract class AbstractContribuicoesGeneratorEFD extends AbstractEFDCommons {
	protected List<RegistroM100> registrosM100;
	private ProcessadorDeParametrosIcmsIpiHelper processadorDeParametros;

	public AbstractContribuicoesGeneratorEFD(Map<String, Object> parametters) {
		processadorDeParametros = new ProcessadorDeParametrosIcmsIpiHelper(parametters);
		processadorDeParametros.processar();
	}

}
