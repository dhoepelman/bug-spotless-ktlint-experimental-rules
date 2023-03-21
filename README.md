# bug-spotless-ktlint-experimental-rules

Spotless seems to not run ktlint experimental rules despite being configured to do so.

In this repository experimental rules are enabled in both `.editorconfig` and `build.gradle.kts`. Despite this:

```shell
$ ./gradlew spotlessCheck

BUILD SUCCESSFUL in 1s
3 actionable tasks: 3 executed
```

```shell
$ ktlint
10:26:22.477 [main] INFO com.pinterest.ktlint.internal.KtlintCommandLine - Enable default patterns [**/*.kt, **/*.kts]
/Users/dhoepelman/git/bug-spotless-ktlint-experimental-rules/src/main/kotlin/Test.kt:1:5: Property name should use the screaming snake case notation when the value can not be changed (cannot be auto-corrected) (experimental:property-naming)

Summary error count (descending) by rule:
  experimental:property-naming: 1
```
