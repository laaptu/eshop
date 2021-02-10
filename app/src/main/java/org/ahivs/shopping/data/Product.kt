package org.ahivs.shopping.data

data class Product(
    val id: Long, val name: String, val description: String,
    val price: Float,
    val originalPrice: Float,
    val thumbnailUrl: Int,
    val imageUrl: Int,
    val categoryId: String,
    val rating: Float,
    val discount: Float = 0f
)
