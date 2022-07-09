package br.com.sankhya.efd;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;

import br.com.sankhya.efd.commons.utils.annotations.Column;
import br.com.sankhya.efd.commons.utils.annotations.Validation;
import br.com.sankhya.efd.icmsipi.models.registros.RegistroK100;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá nova estrutura de geração dos arquivos EFD!\n\n");

		RegistroK100 regK100 = new RegistroK100();
		regK100.setValorTotal(BigDecimal.valueOf(15.68));

		try {
			for (Field m : regK100.getClass().getDeclaredFields()) {
				m.setAccessible(true);
				String fieldName = m.getName();
				System.out.println("Field: " + fieldName);
				Object obj = m.get(regK100);
				if(m.getType().equals(BigDecimal.class)) {
					System.out.println("Value: " + ((BigDecimal) obj));
				}else {
					System.out.println(obj);
				}
				
				for (Annotation annotation : m.getAnnotations()) {
					if (annotation instanceof Column) {
						Column column = (Column) annotation;
						System.out.println("columnName:"+column.name());
					}
					if (annotation instanceof Validation) {
						Validation validation = (Validation) annotation;
						System.out.println("visible:" + validation.visible());
						System.out.println("scale:" + validation.scale());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
