Kotlin compiler 2.0 does not detect changes in the Java source file after successful compilation.

Steps to reproduce the problem:

1. Run `./gradlew test`. The test should pass.
2. Change the value of the constant `NAME` in `Constants.java`.
3. Run `./gradlew test`. The test fails. The Kotlin compiler uses the old `NAME` value, while the Java compiler uses the new `NAME` value.
4. Run `./gradlew test --rerun-tasks`. The test passes.
