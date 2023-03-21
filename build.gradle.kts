plugins {
    kotlin("jvm") version "1.8.10"
    id("com.diffplug.spotless") version "6.17.0"
}

repositories { mavenCentral() }

spotless {
    kotlin {
        target("**/*.kt", "**/*.kts")
        ktlint("0.48.2")
            .setUseExperimental(true)
            .setEditorConfigPath("$rootDir/.editorconfig")
    }
}
