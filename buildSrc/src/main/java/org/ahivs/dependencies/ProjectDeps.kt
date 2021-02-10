package org.ahivs.dependencies

object Version {
    const val kotlin = "1.3.72"
    const val gradleAndroid = "4.1.1"

    object Android {
        const val material = "1.3.0"
        const val appcompat = "1.2.0"
        const val coreKtx = "1.3.2"
        const val androidxActivity = "1.1.0"
        const val lifecycleExtension = "2.1.0"
        const val constraintLayout = "2.0.4"
    }

    object TestLib {
        const val mockito = "2.25.0"
        const val junit5 = "5.5.1"
    }
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"

    object Android {
        const val material = "com.google.android.material:material:${Version.Android.material}"
        const val appcompat = "androidx.appcompat:appcompat:${Version.Android.appcompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.Android.constraintLayout}"
        const val coreKtx = "androidx.core:core-ktx:${Version.Android.coreKtx}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Version.Android.lifecycleExtension}"
        const val androidxActivity =
            "androidx.activity:activity-ktx:${Version.Android.androidxActivity}"
    }
}

object TestLibs {
    const val mockitoCore = "org.mockito:mockito-core:${Version.TestLib.mockito}"
    const val mockitoInline = "org.mockito:mockito-inline:${Version.TestLib.mockito}"

    const val junit5 = "org.junit.jupiter:junit-jupiter-api:${Version.TestLib.junit5}"
    const val junit5Engine = "org.junit.jupiter:junit-jupiter-engine:${Version.TestLib.junit5}"
    const val junit5Params = "org.junit.jupiter:junit-jupiter-params:${Version.TestLib.junit5}"

    object Android {
        const val arch = "androidx.arch.core:core-testing:${Version.Android.lifecycleExtension}"
    }
}

object GradlePlugin {
    const val android = "com.android.tools.build:gradle:${Version.gradleAndroid}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val junit5 = "de.mannodermaus.gradle.plugins:android-junit5:1.7.0.0"
}