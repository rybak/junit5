import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	`kotlin-dsl`
}

repositories {
	mavenCentral()
	gradlePluginPortal()
	maven(url = "https://repo.gradle.org/gradle/enterprise-libs-release-candidates-local/")
}

dependencies {
	implementation(kotlin("gradle-plugin"))
	implementation("biz.aQute.bnd:biz.aQute.bnd.gradle:5.3.0")
	implementation("com.github.jengelman.gradle.plugins:shadow:6.1.0")
	implementation("org.gradle:test-retry-gradle-plugin:1.2.1")
	compileOnly("com.gradle.enterprise:test-distribution-gradle-plugin:2.0.2")
}

tasks.withType<KotlinCompile>().configureEach {
	kotlinOptions {
		allWarningsAsErrors = true
	}
}
