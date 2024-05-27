# API RESTful de Creación de Usuarios

Esta es una aplicación Spring Boot que expone una API RESTful para la creación de usuarios.

## Requisitos

- Java 17
- Gradle

## Ejecución

1. Clona el repositorio.
2. Navega al directorio del proyecto.
3. Ejecuta `./gradlew bootRun`.

## Uso

Para crear un usuario, realiza una solicitud POST a `http://localhost:8080/user` con el siguiente JSON:

```json
{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}
```

Si el usuario se crea con éxito, recibirás una respuesta con el siguiente formato:

```json
{
  "id": "UUID",
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ],
  "created": "2024-05-27T00:00:00",
  "modified": "2024-05-27T00:00:00",
  "lastLogin": "2024-05-01",
  "token": "xyz",
  "isactive": true
}
```

NOTA:

Dado que estamos utilizando una base de datos en memoria H2 con Spring Boot, no es necesario un script explícito para levantar la base de datos. La configuración de H2 y JPA en application.properties y la anotación @Entity en nuestras clases de modelo se encargan de crear y gestionar las tablas automáticamente.
