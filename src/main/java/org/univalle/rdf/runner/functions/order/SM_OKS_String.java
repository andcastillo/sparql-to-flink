package org.univalle.rdf.runner.functions.order;

import org.apache.flink.api.java.functions.KeySelector;
import org.univalle.rdf.runner.functions.SolutionMapping;

// SolutionMapping - Key Selector Order by
public class SM_OKS_String implements KeySelector<SolutionMapping, String> {

	private String key;

	public SM_OKS_String(String k) {
		this.key = k;
	}

	@Override
	public String getKey(SolutionMapping sm) {
	    String value ="";
		if(sm.getMapping().get(key).isLiteral()) {
            value = sm.getMapping().get(key).getLiteralValue().toString();
        }else if(sm.getMapping().get(key).isURI()){
            value = sm.getMapping().get(key).toString();
        }
        return value;
	}

}
