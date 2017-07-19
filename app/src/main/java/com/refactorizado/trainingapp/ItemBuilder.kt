package com.refactorizado.trainingapp

class ItemBuilder {
    companion object {
        fun build() : List<Item>{
            return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it") }
        }
    }
}