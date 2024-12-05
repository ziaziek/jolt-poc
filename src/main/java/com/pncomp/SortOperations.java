package com.pncomp;

import com.bazaarvoice.jolt.JsonUtils;
import com.bazaarvoice.jolt.Sortr;

import java.util.Map;

public class SortOperations {

    private static final String basePath = "/json/sample/sortr/";


    public void run(final String inputFilename){
        Map<String, Object> inputMap = JsonUtils.classpathToMap(basePath + inputFilename);
        Sortr sorting = new Sortr();

        Map<String, Object> outputMap = (Map<String, Object>) sorting.transform(inputMap);

        for(String k : outputMap.keySet()){
            System.out.println(k + " : "+ outputMap.get(k));
        }
    }
}
