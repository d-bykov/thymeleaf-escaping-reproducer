plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.thymeleaf:thymeleaf:3.0.12.RELEASE")
}

application {
    mainClass.set("AppKt")
}
