package org.univalle.rdf.runner.functions;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.jena.graph.Node;
import org.apache.jena.graph.Triple;

//Triple to Triple - Filter Function
public class T2T_FF implements FilterFunction<Triple> {

	String subject, predicate, object = null;

	public T2T_FF(String s, String p, String o){
		this.subject = s;
		this.predicate = p;
		this.object = o;
	}

	public boolean evalObject(Node node){
		Boolean flag = false;
		if(node.isLiteral()) {
			if (node.getLiteralValue().toString().equals(object)){
				flag = true;
			}
		} else if (node.isURI()) {
			if (node.toString().equals(object)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public boolean filter(Triple t) {
		if(subject==null && predicate!=null && object!=null) {
			return t.getPredicate().toString().equals(predicate) && evalObject(t.getObject());
		} else if(subject!=null && predicate==null && object!=null) {
			return t.getSubject().toString().equals(subject) && evalObject(t.getObject());
		} else if(subject!=null && predicate!=null && object==null) {
			return t.getSubject().toString().equals(subject) && t.getPredicate().toString().equals(predicate);
		} else if(subject!=null && predicate==null && object==null) {
			return t.getSubject().toString().equals(subject);
		} else if(subject==null && predicate!=null && object==null) {
			return t.getPredicate().toString().equals(predicate);
		} else if(subject==null && predicate==null && object!=null) {
			return evalObject(t.getObject());
		} else {
			return true;
		}
	}
}
