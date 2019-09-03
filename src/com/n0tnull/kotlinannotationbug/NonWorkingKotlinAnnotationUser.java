package com.n0tnull.kotlinannotationbug;

/**
 * When using annotation declared in a Kotlin file and wrapped in an interface,
 * default values are not correctly detected in Java
 */
@KotlinInterface.NonWorkingDummyKotlinAnnotation
public class NonWorkingKotlinAnnotationUser {

}
