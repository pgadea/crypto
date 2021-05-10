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

    // Networking
    implementation("com.squareup.okhttp:okhttp:2.7.5")
    implementation("com.squareup.okhttp:okhttp-urlconnection:2.7.5")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.4.0")


    /* TODO
        Evaluate libraries for math, plotting, etc. Some resources can be found here:
        
        https://kotlinlang.org/docs/data-science-overview.html#java-libraries
        https://github.com/thomasnield/kotlin-data-science-resources
     */

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}