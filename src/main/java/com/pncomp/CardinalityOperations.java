package com.pncomp;

import com.bazaarvoice.jolt.CardinalityTransform;

public class CardinalityOperations extends Operations {

    public CardinalityOperations(String basePath) {
        super(basePath);
    }

    @Override
    Object runTransformation(Object spec, Object input) {
        return new CardinalityTransform(spec).transform(input);
    }

}
