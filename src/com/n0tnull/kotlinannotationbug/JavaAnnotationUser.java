package com.n0tnull.kotlinannotationbug;

import com.n0tnull.kotlinannotationbug.JavaInterface.DummyJavaAnnotation;

/**
 * When using annotation declared in a Java file, even if it is wrapped in an interface,
 * we have no issues with default values in Java.
 */
@DummyJavaAnnotation
public class JavaAnnotationUser {

}
