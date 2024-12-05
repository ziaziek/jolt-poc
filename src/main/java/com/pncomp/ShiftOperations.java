package com.pncomp;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

import java.util.HashMap;
import java.util.Map;

public class ShiftOperations {

    private static final String basePath = "/json/sample/shiftr/";

    private static Map<String, String> fileNames = new HashMap<>(){
        {
            put("spec.json", "input.json");
            put("specWildcards.json", "inputWildcards.json");
            put("specArrays.json", "inputArrays.json");
        }
    };

    public void run(){
        fileNames.forEach(this::runBasic);
    }

    private void runBasic(final String specFilename, final String inputFilename){
        Object chainrSpecJSON = JsonUtils.classpathToObject(basePath + specFilename);
        Chainr chainr = Chainr.fromSpec( chainrSpecJSON );

        Object inputJSON = JsonUtils.classpathToObject(basePath + inputFilename);

        Object transformedOutput = chainr.transform( inputJSON );
        System.out.println( JsonUtils.toPrettyJsonString( transformedOutput ) );
    }

}
