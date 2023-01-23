plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.linus.demo"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "org.linus.demo"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(Deps.coreKtx)
    implementation(Deps.lifeCycle)
    implementation(Deps.activityCompose)
    implementation(Deps.compose)
    implementation(Deps.composePreview)
    implementation(Deps.material)
    testImplementation(TestDeps.junit)
    androidTestImplementation(TestDeps.androidJUnit)
    androidTestImplementation(TestDeps.espresso)
    androidTestImplementation(TestDeps.composeTestJUnit)
    debugImplementation(DebugDeps.composeUiTooling)
    debugImplementation(DebugDeps.composeTestManifest)
}