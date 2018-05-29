package org.univalle.rdf.runner.functions.filter;

import org.apache.jena.datatypes.xsd.XSDDateTime;
import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.E_LessThan;
import org.apache.jena.sparql.expr.Expr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.HashMap;

public class LessThan{

	Expr arg1 = null;
	Expr arg2 = null;

	public LessThan(E_LessThan expresion){
		this.arg1 = expresion.getArg1();
		this.arg2 = expresion.getArg2();
	}

	public boolean eval(HashMap<String, Node> solutionMapping) {
		Boolean flag = false;

		Node value_left = solutionMapping.get(arg1.toString());
		Node value_right = null;
		if (arg2.isConstant()) {
			value_right = arg2.getConstant().getNode();
		} else if (arg2.isVariable()) {
			value_right = solutionMapping.get(arg2.toString());
		}

		//System.out.println("LessThan: " + arg1.toString() + "--" + arg2.toString() + " **** " + value_left + " < " + value_right);

		if (value_left.getLiteralDatatype().getJavaClass().equals(BigDecimal.class)) {
			if (Double.parseDouble(value_left.getLiteralValue().toString()) < Double.parseDouble(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- BigDecimal");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(BigInteger.class)) {
			if (Integer.parseInt(value_left.getLiteralValue().toString()) < Integer.parseInt(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- BigDecimal");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Float.class)) {
			if (Float.parseFloat(value_left.getLiteralValue().toString()) < Float.parseFloat(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- BigDecimal");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Double.class)) {
			if (Double.parseDouble(value_left.getLiteralValue().toString()) < Double.parseDouble(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- Double");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Integer.class)) {
			if (Integer.parseInt(value_left.getLiteralValue().toString()) < Integer.parseInt(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- Integer");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Long.class)) {
			if (Long.parseLong(value_left.getLiteralValue().toString()) < Long.parseLong(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- Long");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Short.class)) {
			if (Short.parseShort(value_left.getLiteralValue().toString()) < Short.parseShort(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- Short");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(Byte.class)) {
			if (Byte.parseByte(value_left.getLiteralValue().toString()) < Byte.parseByte(value_right.getLiteralValue().toString())) {
				//System.out.println("--- LessThan --- Short");
				flag = true;
			}
		} else if (value_left.getLiteralDatatype().getJavaClass().equals(XSDDateTime.class)) {
			Timestamp timestampLeft = Timestamp.valueOf(value_left.getLiteralValue().toString().replace("T", " "));
			Timestamp timestampRight = Timestamp.valueOf(value_right.getLiteralValue().toString().replace("T", " "));
			long leftTime = timestampLeft.getTime();
			long rightTime = timestampRight.getTime();

			if (leftTime < rightTime) {
				//System.out.println("--- LessThan --- XSDDateTime");
				flag = true;
			}
		} else {
			System.out.println("--- getJavaClass --- " + value_left.getLiteralDatatype().getJavaClass());
		}

		return flag;
	}
}
