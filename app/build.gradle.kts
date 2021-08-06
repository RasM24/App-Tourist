plugins {
	id("android-application-convection")
}

dependencies {
	implementation(project(":component-compose"))

	//Core
	implementation(AndroidX.core)
	implementation(AndroidX.appcompat)
	implementation(AndroidX.lifecycleRuntime)
	implementation(AndroidX.activityCompose)
	implementation(AndroidX.material)

	//Jetpack Compose
	implementation(JetpackCompose.ui)
	implementation(JetpackCompose.uiTooling)
	implementation(JetpackCompose.material)
}