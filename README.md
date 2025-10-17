[![CI/CD Pipeline](https://github.com/soydz/as-lab2-ci-cd/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/soydz/as-lab2-ci-cd/actions/workflows/build.yml)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=soydz_as-lab2-ci-cd&metric=coverage)](https://sonarcloud.io/summary/new_code?id=soydz_as-lab2-ci-cd)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=soydz_as-lab2-ci-cd&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=soydz_as-lab2-ci-cd)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=soydz_as-lab2-ci-cd&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=soydz_as-lab2-ci-cd)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=soydz_as-lab2-ci-cd&metric=bugs)](https://sonarcloud.io/summary/new_code?id=soydz_as-lab2-ci-cd)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```

