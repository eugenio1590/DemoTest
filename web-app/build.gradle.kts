plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":core"))
    implementation(kotlin("stdlib-js"))
}

kotlin.target.browser { }