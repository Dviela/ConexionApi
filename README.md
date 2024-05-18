# ConexionAPI

Esta es una aplicación JavaFX que se conecta a una base de datos MySQL y muestra datos en listas. La aplicación permite recuperar y mostrar datos de dos tablas diferentes (`book` y `user`) utilizando botones para iniciar las consultas.

## Características

- Interfaz gráfica de usuario (GUI) con JavaFX.
- Conexión a una base de datos MySQL.
- Recuperación y visualización de datos de dos tablas (`book` y `user`).
- Botones para iniciar la recuperación de datos.
- Diseño responsivo y moderno.

## Requisitos

- Java 17 o superior
- MySQL
- Maven

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/Dviela/ConexionApi.git
    cd JavaFXMySQLApp
    ```

2. Configura la base de datos MySQL:
    - Crea una base de datos y las tablas necesarias (`book` y `user`).
    - Inserta datos de prueba en las tablas.

3. Configura las credenciales de la base de datos en el archivo `application.properties` o directamente en el código:

    ```java
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String JDBC_USER = "tu_usuario";
    private static final String JDBC_PASSWORD = "tu_contraseña";
    ```

4. Construye y ejecuta la aplicación:

    ```bash
    mvn clean install
    mvn javafx:run
    ```

## Uso

- Ejecuta la aplicación.
- Haz clic en el botón "Fetch Books" para recuperar y mostrar los datos de la tabla `book`.
- Haz clic en el botón "Fetch Users" para recuperar y mostrar los datos de la tabla `user`.

## Estructura del Proyecto

- `src/main/java/com/example/JavaFXRetrofitApp/`: Contiene el código fuente de la aplicación.
  - `App.java`: Clase principal que inicia la aplicación JavaFX.
  - `AppController.java`: Controlador que maneja la lógica de la aplicación.
  - `DatabaseService.java`: Clase que maneja la conexión y consultas a la base de datos.
- `src/main/resources/`: Contiene los archivos FXML y otros recursos.
  - `main.fxml`: Archivo FXML que define la interfaz de usuario.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor haz un fork del repositorio, crea una rama con tus cambios y abre un pull request.

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature-nueva-caracteristica`).
3. Realiza tus cambios.
4. Haz un commit de tus cambios (`git commit -am 'Añadir nueva característica'`).
5. Sube tus cambios (`git push origin feature-nueva-caracteristica`).
6. Abre un Pull Request.
