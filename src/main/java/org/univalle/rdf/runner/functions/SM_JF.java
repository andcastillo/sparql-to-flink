package org.univalle.rdf.runner.functions;

import org.apache.flink.api.common.functions.FlatJoinFunction;
import org.apache.flink.util.Collector;

//SolutionMapping - Flat Join Function
public class SM_JF implements FlatJoinFunction<SolutionMapping, SolutionMapping, SolutionMapping> {

    @Override
    public void join(SolutionMapping left, SolutionMapping right, Collector<SolutionMapping> out) throws Exception {
        out.collect(left.join(right));
    }
}
