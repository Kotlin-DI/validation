package com.github.kotlin_di.serialization

import com.github.kotlin_di.common.annotations.DTO
import com.github.kotlin_di.common.annotations.PostValidation
import com.github.kotlin_di.common.annotations.Transform
import com.github.kotlin_di.common.interfaces.Transformer
import com.github.kotlin_di.common.interfaces.UObject
import com.github.kotlin_di.resolve

@DTO
interface Dataclass {
    @Positive
    val A: Int

    var B: Dataclass
}

@PostValidation
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Positive(val nullable: Boolean = true)