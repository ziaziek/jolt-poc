package com.pncomp;

import com.bazaarvoice.jolt.Removr;

public class RemovrOperations extends Operations {

    public RemovrOperations(String basePath) {
        super(basePath);
    }


    @Override
    Object runTransformation(Object spec, Object input) {
        Removr removr = new Removr(spec);
        return removr.transform(input);
    }

}
