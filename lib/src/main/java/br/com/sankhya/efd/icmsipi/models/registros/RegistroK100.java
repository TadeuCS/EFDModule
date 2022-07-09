package br.com.sankhya.efd.icmsipi.models.registros;

import java.math.BigDecimal;

import br.com.sankhya.efd.commons.utils.annotations.Column;
import br.com.sankhya.efd.commons.utils.annotations.Validation;

public class RegistroK100 {
	private BigDecimal valorDesconto;
	private BigDecimal valorImposto;
	@Column(name = "VALOR_TOTAL")
	@Validation(scale = 6, visible = false)
	private BigDecimal valorTotal;

	public RegistroK100() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(BigDecimal valorImposto) {
		this.valorImposto = valorImposto;
	}

}
