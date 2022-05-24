# Principios SOLID en Java


> Learn SOLID principles by examples

## Intro

This is a repository intended to serve as illustrative examples

## Requerimientos

1. Install Java 8
3. Clone this repository: `git clone https://github.com/guffenix/apply-solid-java`.
4. Execute some [Gradle lifecycle tasks](https://docs.gradle.org/current/userguide/java_plugin.html#lifecycle_tasks) in order to check everything is OK:
    1. Create [the project JAR](https://docs.gradle.org/current/userguide/java_plugin.html#sec:jar): `make build`
    2. Run the tests and plugins verification tasks: `make test`
5. Start playing around with the different examples of each SOLID principle. You have explanations here and in the test code 🙂

## Cómo actualizar?

* Gradle (current version: 5.6 - [releases](https://gradle.org/releases/)):
`./gradlew wrapper --gradle-version=5.6 --distribution-type=bin` or modifying the [gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties#L3)
* JUnit (current version: 5.5.1 - [releases](https://junit.org/junit5/docs/snapshot/release-notes/index.html)):
[`build.gradle:11`](build.gradle#L11-L12)


## Liskov Substitution Principle (LSP)

* Package: `solutions.mundovirtual.solid_principles.liskov_substitution_principle`
* [Production code](src/main/java/solutions/mundovirtual/solid_principles/liskov_substitution_principle)
* [Tests code with explanations](src/test/java/solutions/mundovirtual/solid_principles/liskov_substitution_principle)

## Dependency Inversion Principle (DIP)

* Package: `solutions.mundovirtual.codely.solid_principles.dependency_inversion_principle`
* [Production code](src/main/java/solutions/mundovirtual/solid_principles/dependency_inversion_principle)
* [Tests code with explanations](src/test/java/solutions/mundovirtual/solid_principles/dependency_inversion_principle)

## License

The MIT License (MIT). Please see [License](LICENSE) for more information.
