package br.com.sankhya.efd.icmsipi;

import java.util.Map;

import br.com.sankhya.efd.commons.models.Registro0000;
import br.com.sankhya.efd.commons.models.RegistroC100;
import br.com.sankhya.efd.icmsipi.helpers.CarregadorDeRegistrosDoBancoIcmsIpiHelper;
import br.com.sankhya.efd.icmsipi.helpers.EscritorArquivoTxtIcmsIpiPorResultSetHelper;
import br.com.sankhya.efd.icmsipi.helpers.GravadorDeRegistrosNoBancoDeDadosIcmsIpiHelper;
import br.com.sankhya.efd.icmsipi.models.registros.RegistroK100;
import br.com.sankhya.efd.icmsipi.utils.AbstractIcmsIpiGeneratorEFD;
import br.com.sankhya.efd.icmsipi.utils.IEFDIcmsIpiGenerator;
import br.com.sankhya.efd.icmsipi.utils.IEFDIcmsIpiProcessor;

public class EFDIcmsIpiHtml extends AbstractIcmsIpiGeneratorEFD implements IEFDIcmsIpiProcessor, IEFDIcmsIpiGenerator{
	private GravadorDeRegistrosNoBancoDeDadosIcmsIpiHelper gravadorDeRegistros;
	private CarregadorDeRegistrosDoBancoIcmsIpiHelper carregadorDeRegistrosDoBanco;
	private EscritorArquivoTxtIcmsIpiPorResultSetHelper escritorDeArquivoTXT;
	private boolean gravar;
	public EFDIcmsIpiHtml(Map<String, Object> parametters, boolean gravar) {
		super(parametters);
		this.gravar=gravar;
	}
	
	@Override
	public void processar() {
		processarBloco0000();
		processarBlocoC();
		processarBlocoK();
	}

	@Override
	public void gerar() {
		gerarBloco0000();
		gerarBlocoC();
		gerarBlocoK();
	}

	@Override
	public void processarBloco0000() {
		registros0000.add(new Registro0000());
	}

	@Override
	public void processarBlocoC() {
		registrosC100.add(new RegistroC100());
	}

	@Override
	public void gerarBloco0000() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarBlocoC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarBlocoK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processarBlocoK() {
		registrosK100.add(new RegistroK100());
	}

}
