package org.ahivs.shopping.ui.productlist

import org.ahivs.shopping.R
import org.ahivs.shopping.data.Product

class ProductsApi {
    fun getProducts(): List<Product> = listOf(
        Product(
            1,
            "Nintendo Switch",
            "Play your favourite games anytime, anywhere, with anyone, with Nintendo Switch",
            360f,
            400f,
            R.drawable.ninetendo_switch_thumb,
            R.drawable.ninetendo_switch,
            "123",
            4f,
            0.1f
        ),
        Product(
            2,
            "iPhone Xs Max",
            "iPhone XS is everything you love about iPhone. Taken to the extreme.",
            2000f,
            2000f,
            R.drawable.iphone_max_thumb,
            R.drawable.iphone_max,
            "234",
            3f
        ),
        Product(
            3,
            "Pixel 3 XL",
            "Pixel 3 and Pixel 3 XL are everything you wish your phone could do. Brilliant camera, all day battery, and Google Assistant with a squeeze",
            1200f,
            1500f,
            R.drawable.pixel3_thumb,
            R.drawable.pixel3,
            "345",
            2.5f,
            0.2f
        ),
        Product(
            4,
            "Sony Alpha 7 III R",
            "Sony's latest A7 series cameras combine high resolution with high speed and professional performance",
            5000f,
            5000f,
            R.drawable.sony_thumb,
            R.drawable.sony,
            "456",
            4.5f
        ),
        Product(
            5,
            "Leica M10",
            "When you take a photograph with a Leica M-System camera, you experience a different kind of photography.",
            8755f,
            10300f,
            R.drawable.leica_thumb,
            R.drawable.leica,
            "567",
            3.5f,
            .15f
        ),
        Product(
            6,
            "Apple AirPods",
            "With 24-hour battery life and groundbreaking ease of use and intelligence, AirPods are wireless headphones unlike any other.",
            200f,
            200f,
            R.drawable.airpods_thumb,
            R.drawable.airpods,
            "678",
            2f
        ),
        Product(
            6,
            "Apple AirPods",
            "With 24-hour battery life and groundbreaking ease of use and intelligence, AirPods are wireless headphones unlike any other.",
            200f,
            200f,
            R.drawable.airpods_thumb,
            R.drawable.airpods,
            "678",
            2f
        ),
        Product(
            7,
            "Sennheiser PXC550",
            "Superior quality headphones with top level of comfort, deep sound and compactness",
            430f,
            430f,
            R.drawable.pxc_thumb,
            R.drawable.pxc,
            "789",
            3f
        ),
        Product(
            8,
            "B&W PX",
            "Great noise cancelling, bluetooth capabilities and sound quality",
            412.5f,
            550f,
            R.drawable.bw_thumb,
            R.drawable.bw,
            "8910",
            5f,
            .25f
        ),
        Product(
            9,
            "AudioQuest Nighthawk",
            "Sophisticated bio-friendly Headphone with style, luxurious comfort and high quality sound.",
            1000f,
            1000f,
            R.drawable.audio_thumb,
            R.drawable.audio,
            "91011",
            3f
        ),
        Product(
            10,
            "HHKB Pro 2",
            "A movement, redefining what a professional keyboard",
            500f,
            500f,
            R.drawable.hh_thumb,
            R.drawable.hh,
            "101112",
            4.5f
        ),
        Product(
            11,
            "Ergodox EZ",
            "An open-source keyboard for serious developers, gamers, and people who care deeply about their craft.",
            945f,
            1350f,
            R.drawable.ergo_thumb,
            R.drawable.ergo,
            "101112",
            4f,
            0.3f
        ),
        Product(
            12,
            "X-Bows Ergonomic",
            "Ergo mech keyboard that great for long days at work and intense gaming sessions",
            170f,
            170f,
            R.drawable.xbow_thumb,
            R.drawable.xbow,
            "101112",
            2.5f
        )
    )
}