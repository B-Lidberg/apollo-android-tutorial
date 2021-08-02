plugins {
    id("com.android.application")
    id("kotlin-android")
    id("androidx.navigation.safeargs.kotlin")
    id("com.apollographql.apollo").version("2.5.9")
}

android {
    compileSdk = 30
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.example.rocketreserver"
        minSdk = 23
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0"
    }
}



tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

apollo {
    generateKotlinModels.set(true)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("io.coil-kt:coil:1.3.1")

    implementation("androidx.paging:paging-runtime-ktx:3.0.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.security:security-crypto:1.1.0-alpha03")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.0-alpha05")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.0-alpha05")
    androidTestImplementation("androidx.navigation:navigation-testing:2.4.0-alpha05")

    // Apollo
    implementation("com.apollographql.apollo:apollo-runtime:2.5.9")
    implementation("com.apollographql.apollo:apollo-api:2.5.9")
    implementation("com.apollographql.apollo:apollo-coroutines-support:2.5.9")

    // Jetpack Compose

    // Integration with activities
    implementation("androidx.activity:activity-compose:1.3.0")
    // Compose Material Design
    implementation("androidx.compose.material:material:1.0.0")
    // Animations
    implementation("androidx.compose.animation:animation:1.0.0")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:1.0.0")
    // Integration with ViewModels
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07")
    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.0")
    // When using a AppCompat theme
    implementation("com.google.accompanist:accompanist-appcompat-theme:0.15.0")
//    // When using a MDC theme
//    implementation("com.google.android.material:compose-theme-adapter:1.0.0-rc02")


    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}