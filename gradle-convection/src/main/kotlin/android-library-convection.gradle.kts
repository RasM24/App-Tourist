import com.android.build.api.dsl.LibraryExtension

plugins {
	id("com.android.library")
	kotlin("android")
}

configure<LibraryExtension> {
	compileSdk = 30

	defaultConfig {
		minSdk = 21
		targetSdk = 30

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
}