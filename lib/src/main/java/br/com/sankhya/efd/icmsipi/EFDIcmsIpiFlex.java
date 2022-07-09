package br.com.sankhya.efd.icmsipi;

import java.util.Map;

import br.com.sankhya.efd.icmsipi.helpers.EscritorArquivoTxtIcmsIpiPorDtoHelper;
import br.com.sankhya.efd.icmsipi.models.registros.RegistroK100;
import br.com.sankhya.efd.icmsipi.utils.AbstractIcmsIpiGeneratorEFD;
import br.com.sankhya.efd.icmsipi.utils.IEFDIcmsIpiGenerator;
import br.com.sankhya.efd.icmsipi.utils.IEFDIcmsIpiProcessor;

public class EFDIcmsIpiFlex extends AbstractIcmsIpiGeneratorEFD implements IEFDIcmsIpiProcessor, IEFDIcmsIpiGenerator {
	private EscritorArquivoTxtIcmsIpiPorDtoHelper escritorArquivoTxtIcmsIpiPorDto;
	public EFDIcmsIpiFlex(Map<String, Object> parametters) {
		super(parametters);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processarBlocoC() {
		// TODO Auto-generated method stub
		
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
