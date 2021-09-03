package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Medicamento;
import org.springframework.stereotype.Service;

public interface MedicamentoService {

	public abstract Medicamento insertaActualiza(Medicamento obj);
	public abstract List<Medicamento> listaMedicamento();
	
}
