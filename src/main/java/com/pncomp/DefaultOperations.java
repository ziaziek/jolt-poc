package com.pncomp;

import com.bazaarvoice.jolt.Defaultr;

public class DefaultOperations extends Operations {


    public DefaultOperations(String basePath) {
        super(basePath);
    }

    @Override
    Object runTransformation(Object spec, Object input) {
        return new Defaultr(spec).transform(input);
    }

}
