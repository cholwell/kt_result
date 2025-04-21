rootProject.name = "kt_result"

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/cholwell/kt_result")
            val gpruser: String? by settings
            val gprkey: String? by settings
            credentials {
                username = gpruser
                password = gprkey
            }
        }
        mavenCentral()
    }
}
