# ERP Lite

Aplicacion base para un ERP ligero construida como proyecto Gradle multi-modulo con Spring Boot y Java 25.

## Stack

- Java 25
- Spring Boot 4.0.0
- Gradle
- Spring Web en `erp-api`
- Lombok compartido en todos los modulos

## Modulos

- `erp-common`: utilidades y componentes compartidos
- `erp-domain`: modelo y reglas de dominio
- `erp-application`: casos de uso y orquestacion
- `erp-infrastructure`: adaptadores e integraciones
- `erp-api`: modulo ejecutable con Spring Boot y capa web

## Requisitos

- JDK 25
- Git

## Ejecutar en local

```bash
./gradlew :erp-api:bootRun
```

La aplicacion inicia por defecto en:

```text
http://localhost:8900
```

## Ejecutar pruebas

```bash
./gradlew clean build
```

## Estructura

- `erp-common/src/main/java`
- `erp-domain/src/main/java`
- `erp-application/src/main/java`
- `erp-infrastructure/src/main/java`
- `erp-api/src/main/java`

## Estado actual

Este repositorio contiene la base estructural multi-modulo del ERP. Todavia no incluye modulos funcionales del negocio.