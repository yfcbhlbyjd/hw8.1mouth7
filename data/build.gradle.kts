plugins {
    id (Plugins.AGP.library)
    id (Plugins.Kotlin.android)
    id (Pligins.Kotlin.kapt)
}

android {
    namespace = "com.geektech.data"
    compileSdk = AndroidConfig.compileDsk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles ("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {


}