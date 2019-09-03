package com.n0tnull.kotlinannotationbug;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

interface JavaInterface {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface DummyJavaAnnotation {

        String tag() default "";

        int resourceIdentifier() default -1;

        boolean enabled() default true;

    }
}
