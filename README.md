# Sistema de Gestión de Biblioteca en Java

Este proyecto implementa un sistema de gestión de biblioteca en Java que permite a los usuarios realizar operaciones básicas sobre una colección de libros técnicos de programación a través de una interfaz en consola.

## Objetivos de Aprendizaje

- Introducción a Java y Programación Orientada a Objetos (OOP).
- Desarrollo de un proyecto incremental con enfoque en refactorización.
- Aproximación a la arquitectura y patrones de diseño utilizados en Spring.
- Implementación de tests unitarios básicos.

## Descripción General

La aplicación de consola permite a los usuarios gestionar una colección de libros técnicos de programación. A través de un menú interactivo, los usuarios pueden:

1. **Ver todos los libros**: Muestra una lista de todos los libros almacenados en el sistema.
2. **Añadir un nuevo libro**: Permite agregar un libro a la colección ingresando el título, autor y ISBN.
3. **Eliminar un libro**: Elimina un libro específico de la colección.
4. **Cambiar repositorio**: Permite almacenar los datos en memoria o en una base de datos.
5. **Salir de la aplicación**: Finaliza el programa.

---

## Tabla de Contenidos

1. [Funcionalidades](#funcionalidades)
2. [Tecnologías Utilizadas](#tecnologías-utilizadas)
3. [Estructura del Proyecto](#estructura-del-proyecto)
4. [Instalación](#instalación)
5. [Uso](#uso)
6. [Características](#características)
7. [Autores y Agradecimientos](#autores-y-agradecimientos)
8. [Diagrama UML](#diagrama-uml)


## Funcionalidades

- [x]  Ver todos los libros: Presenta una lista con los libros en la colección.  
- [x] Añadir un nuevo libro: Permite introducir un nuevo libro con título, autor e ISBN (una letra seguida de tres números).  
- [x] Eliminar un libro: Elimina un libro de la colección al ingresar su ISBN.
- [x] Cambiar de repositorio: Permite cambiar el sistema de almacenamiento de libros, en memoria o en la base de datos.  
- [x] Salir de la aplicación: Termina la ejecución del programa.  

## Tecnologías Utilizadas

Este proyecto utiliza las siguientes tecnologías y herramientas:

- **Java 21 (Corretto)**: Lenguaje de programación principal.
- **JUnit 5**: Framework para la implementación de tests unitarios.
- **Maven**: Sistema de gestión de dependencias y compilación.
- **MySQL**: Base de datos relacional.
- **Git**: Control de versiones para la gestión de cambios en el código.
- **IntelliJ IDEA / Eclipse**: IDEs recomendados para desarrollo en Java.
- **draw.io**: Herramienta para crear diagramas UML.


## Estructura del Proyecto

El proyecto está compuesto por tres archivos principales:

- **Main.java**: Punto de entrada de la aplicación. Inicializa el sistema y llama al método para mostrar el menú interactivo.
- **Book.java**: Define la estructura de un libro con los atributos título, autor e ISBN.
- **Tests**: Se han implementado pruebas unitarias básicas para verificar el funcionamiento de los métodos en el repositorio de libros. 
---

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://[github.com/usuario/tech-books-manager-app.git](https://github.com/ElClubDeLas5API/techBookManagmentApp.git)
## Uso
Al iniciar el sistema, verás un menú interactivo con las siguientes opciones:
  1. Ver todos los libros
  2. Añadir libro
  3. Eliminar libro
  4. Cambiar repositorio
  5. Salir
A continuación deberás seleccionar la opción deseada:
    Seleccione una opción: "1"
Ha elegido: 
  1.Ver todos los libros 
  ------------------------------------------
  
  Lista de Libros: 
      ··········       
  Titulo: Effective Java
  Autor: Joshua Bloch
  ISBN: A123
      ··········       
  Titulo: Effective Java
  Autor: Joshua Bloch
  ISBN: A123


## Características

- **Ver todos los libros**: 
  - Permite a los usuarios visualizar una lista completa de todos los libros almacenados en el sistema.

- **Añadir un nuevo libro**: 
  - Facilita a los usuarios la adición de nuevos libros proporcionando el título, autor e ISBN (debe tener el formato de una letra seguida de tres números).

- **Eliminar un libro**: 
  - Permite a los usuarios eliminar un libro existente de la colección introduciendo el ISBN correspondiente.

- **Validación de entradas**: 
  - Asegura que todos los campos son obligatorios al añadir un libro y que el ISBN tiene el formato correcto.
  - Notifica al usuario si intenta añadir un libro con un ISBN que ya existe o si proporciona entradas inválidas.

- **Interfaz interactiva**: 
  - Proporciona un menú en la consola que permite al usuario seleccionar acciones como añadir, ver o eliminar libros.

- **Mensajes informativos**: 
  - Informa al usuario sobre el éxito de las operaciones realizadas y muestra mensajes claros en caso de errores.


### Autores y Agradecimientos

- Paula Calvo [![LinkedIn](https://img.icons8.com/color/48/000000/linkedin.png)](https://www.linkedin.com/in/paulacalvogarcia2001/)
- Carla Sanchez [![LinkedIn](https://img.icons8.com/color/48/000000/linkedin.png)](https://www.linkedin.com/in/carla-sanchez24)
- Miguel Reyes [![LinkedIn](https://img.icons8.com/color/48/000000/linkedin.png)](https://www.linkedin.com/in/miguelreyesvasquez/)
- Luis Aranguren [![GitHub](https://img.icons8.com/color/48/000000/github.png)](https://github.com/luisarangurnn)
- Aron Cosmo [![LinkedIn](https://img.icons8.com/color/48/000000/linkedin.png)](https://www.linkedin.com/)


## Diagrama UML

![UMLfinal drawio](https://github.com/user-attachments/assets/b87d9671-e066-4bee-ad48-eb6264c71e73)




