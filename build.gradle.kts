import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72"
}

group = "com.coincalc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//sourceSets.main {
//    java.srcDirs("src/main/java", "src/main/kotlin")
//}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}