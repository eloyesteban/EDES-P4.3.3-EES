plugins {
    kotlin("jvm") version "1.9.21"
    id("io.gitlab.arturbosch.detekt").version("1.23.3")
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}
