import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

plugins {
	id("com.android.application")
	kotlin("android")
}

configure<BaseAppModuleExtension> {
	compileSdk = 30

	defaultConfig {
		minSdk = 21
		targetSdk = 30
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.gradle-convection.runner.AndroidJUnitRunner"
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
}