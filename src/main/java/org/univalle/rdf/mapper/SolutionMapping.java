package org.univalle.rdf.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolutionMapping {

    private static HashMap<Integer, ArrayList<String>> solutionMapping = new HashMap<>();
    public static int indice = 1;

    public static String getKey(int indice_sm_left, int indice_sm_right){
        String key = "";
        if(solutionMapping.get(indice_sm_left)!=null && solutionMapping.get(indice_sm_right)!=null) {
            for (String key_left : solutionMapping.get(indice_sm_left)) {
                for (String key_right : solutionMapping.get(indice_sm_right)) {
                    if (key_left.equals(key_right)) {
                        key = key_right;
                    }
                }
            }
        }
        return key;
    }

    public static void join(int indice_sm, int indice_sm_left, int indice_sm_right){
        ArrayList<String> variables = new ArrayList<>();

        for (String varSML : solutionMapping.get(indice_sm_left)) {
            variables.add(varSML);
        }

        for (String varSMR : solutionMapping.get(indice_sm_right)) {
            if (!(variables.contains(varSMR))) {
                variables.add(varSMR);
            }
        }
        insertSolutionMapping(indice_sm, variables);

    }

    public static void insertSolutionMapping(Integer indice_sm, ArrayList<String> variables){
        solutionMapping.put(indice_sm, variables);
        indice++;
    }

    public static int getIndice(){
        return indice;
    }

    public static HashMap<Integer, ArrayList<String>> getSolutionMapping(){
        return solutionMapping;
    }

    @Override
    public String toString() {
        String sm="";
        for (Map.Entry<Integer, ArrayList<String>> hm : solutionMapping.entrySet()) {
            sm += hm.getKey() + "-->" + hm.getValue().toString() + "\t";
        }
        return sm;
    }

}
