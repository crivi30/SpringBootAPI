package com.esame.util.filter;

import com.esame.model.Record;

public class FilterTotEsRicPresNotIncluded extends Filter2ParParent implements Filter  {
	
		
	public FilterTotEsRicPresNotIncluded(Object parametri) {
		super(parametri);
	}

	public boolean filter(Record record) {
		
		if( record.getTotEsRicPres() <= parametro1 & record.getTotEsRicPres() >= parametro2) {
			return true;
		}
		return false;
	}
}
	