object Dependency {
    object GradlePlugin {
        const val GRADLE_ANDROID = "com.android.tools.build:gradle:${Versions.GRADLE_ANDROID}"
        const val GRADLE_KOTLIN =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.GRADLE_KOTLIN}"
        const val GRADLE_HILT = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
        const val GRADLE_KTLINT = "org.jmailen.gradle:kotlinter-gradle:${Versions.KTLINT}"
    }

    object Kotlin {
        const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"
        const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLINX_COROUTINES}"
        const val COROUTINES_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLINX_COROUTINES}"
    }

    object AndroidX {
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"

        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"

        const val LIFECYCLE_VIEWMODEL_KTX =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
        const val LIFECYCLE_LIVEDATA_KTX =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}"

        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

        const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:${Versions.LEGACY}"
    }

    object Google {
        const val GMS_GOOGLE_SERVICE =
            "com.google.gms:google-services:${Versions.GMS_GOOGLE_SERVICE}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val GMS_PLAY_SERVICE_BASE =
            "com.google.android.gms:play-services-base:${Versions.GMS_PLAY_SERVICE_BASE}"
        const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVEDATA}"
    }

    object Libraries {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
        const val OKHTTP_LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
        const val MOSHI = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
        const val MOSHI_COMPILER = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"
        const val SHIMMER = "com.facebook.shimmer:shimmer:${Versions.SHIMMER}"
        const val CODE_SCANNER = "com.github.yuriy-budiyev:code-scanner:${Versions.CODE_SCANNER}"
        const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
        const val DATASTORE_CORE = "androidx.datastore:datastore-preferences-core:1.0.0"
    }

    object UnitTest {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val MOCKITO = "org.mockito:mockito-core:${Versions.MOCKITO}"
    }

    object AndroidTest {
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    }

    object Coroutine {
        const val COROUTINE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
    }

    object ImageLoad {
        const val COIL = "io.coil-kt:coil:${Versions.COIL_VERSION}"
        const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE_VERSION}"
        const val GLIDE_COMPLILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE_VERSION}"
    }

    object Lottie {
        const val LOTTIE = "com.airbnb.android:lottie:${Versions.LOTTIE_VERSION}"
    }

    object Temi {
        const val TEMI = "com.robotemi:sdk:${Versions.TEMI}"
    }
}