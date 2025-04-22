group = "dev.cholwell"

version = "1.1"

plugins {
    alias(libs.plugins.kotlin)
    `maven-publish`
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/cholwell/kt_result")
            credentials {
                username = project.findProperty("gpruser") as String?
                password = project.findProperty("gprkey") as String?
            }
        }
    }
    publications { register<MavenPublication>("gpr") { from(components["java"]) } }
}

kotlin {
    jvmToolchain(17)
}
