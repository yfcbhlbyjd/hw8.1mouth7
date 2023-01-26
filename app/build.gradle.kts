plugins {
    id (Plugins.AGP.library)
    id (Plugins.Kotlin.android)
    id (Plugins.Kotlin.kapt)
    id (Plugins.DaggerHilt.hilt)
}

android {
    namespace = "com.geektech.hw81mouth7"
    compileSdk = AndroidConfig.compileDsk

    defaultConfig {
        applicationId = "com.geektech.hw81mouth7"
        minSdk = AndroidConfig.m
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
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
    dependencies {
        //Modules
        implementation(project(":domain"))

        //UI
        implementation("androidx.core:core-ktx:1.7.0")
        implementation("androidx.appcompat:appcompat:1.6.0")
        implementation("com.google.android.material:material:1.7.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        // Javax
        implementation(Dependencies.Javax.inject)

        // Room
        implementation(Dependecies.Room.room)
        implementation(Dependecies.Room.compiler)
        implementation(Dependencies.Room.runtime)

        // Coroutines
        implementation(Dependencies.Coroutines.android)

        // Dagger-Hilt
        implementation(Dependencies.DaggerHilt.android)
        kapt(Dependencies.DaggerHilt.compiler)
    }