package com.pncomp;

import com.bazaarvoice.jolt.JsonUtils;
import com.bazaarvoice.jolt.Modifier;

import java.util.Map;

public class ModifrOperations extends Operations{
    public ModifrOperations(String basePath) {
        super(basePath);
    }

    @Override
    Object runTransformation(Object spec, Object input) {
        Map<String, Object> context = JsonUtils.classpathToMap(basePath + "context.json");
        return new Modifier.Defaultr(spec).transform(input, context);
    }
}
