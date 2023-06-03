# Servicio de Hotel

Este proyecto implementa un servicio de gestión de hoteles, utilizando una tabla con los siguientes campos: idHotel (autonumérico), nombre, categoría, precio y disponibilidad (si o no). El servicio proporciona los siguientes recursos:

## Recursos disponibles

### Listado de hoteles disponibles

- Método: GET
- URL: /hoteles/disponibles

Esta petición devuelve la lista de hoteles disponibles en formato JSON.

### Datos de un hotel por nombre

- Método: GET
- URL: /hoteles/{nombre}

Esta petición devuelve los datos de un hotel específico, identificado por su nombre, en formato JSON.

## Requisitos y tecnologías utilizadas

- Java
- Spring Boot
- Base de datos (ej. MySQL, PostgreSQL, MongoDB)
- Dependencias de Spring para la creación de API REST

## Instrucciones de instalación y ejecución

1. Clona este repositorio en tu máquina local.
2. Configura la base de datos y asegúrate de que esté funcionando correctamente.
3. Actualiza los datos de conexión a la base de datos en el archivo de configuración (ej. application.properties).
4. Compila y ejecuta la aplicación utilizando tu IDE o herramienta de línea de comandos.
5. Realiza las peticiones HTTP a los endpoints mencionados anteriormente para interactuar con el servicio de hotel.

## Contribuciones

Si deseas contribuir a este proyecto, puedes seguir los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con el nombre de tu función o mejora.
3. Realiza los cambios necesarios y haz commits en tu rama.
4. Envía un pull request con tus cambios para que sean revisados.

## Autor

Este proyecto fue desarrollado por [Tu Nombre].

Si tienes alguna pregunta o sugerencia, no dudes en contactarme.

