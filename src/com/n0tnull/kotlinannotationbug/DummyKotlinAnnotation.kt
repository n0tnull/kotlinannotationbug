package com.n0tnull.kotlinannotationbug

interface KotlinInterface {

    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    @Target(AnnotationTarget.CLASS)
    annotation class NonWorkingDummyKotlinAnnotation
    (
            val tag: String = "",
            val resourceIdentifier: Int = -1,
            val enabled: Boolean = true
    )

}

@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class WorkingDummyKotlinAnnotation
(
        val tag: String = "",
        val resourceIdentifier: Int = -1,
        val enabled: Boolean = true
)