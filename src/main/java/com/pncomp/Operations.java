package com.pncomp;

import com.bazaarvoice.jolt.JsonUtils;

public abstract class Operations {
    final String basePath;

    public Operations(final String basePath){
        this.basePath = basePath;
    }


    abstract Object runTransformation(Object spec, Object input);

    public void run(final String specFilename, final String inputFilename){
        Object specJSON = JsonUtils.classpathToMap(basePath + specFilename);
        Object inputJSON = JsonUtils.classpathToObject(basePath + inputFilename);

        Object result = runTransformation(specJSON, inputJSON);

        System.out.println(JsonUtils.toPrettyJsonString(result));
    }
}
