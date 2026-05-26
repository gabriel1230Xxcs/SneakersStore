# SneakersStore

Sistema de Tienda de Tenis Premium desarrollado en Java utilizando Programación Orientada a Objetos (POO), interfaces gráficas con Swing y gestión de proyectos con GitHub.

---

# Autor

Gabriel Rodriguez

---

# Descripción del Proyecto

Sneakers Store Premium es un sistema de escritorio desarrollado en Java que simula una tienda moderna de tenis. El sistema permite iniciar sesión, administrar productos, registrar clientes, visualizar estadísticas y gestionar ventas mediante una interfaz gráfica interactiva.

El proyecto fue desarrollado aplicando los pilares fundamentales de la Programación Orientada a Objetos:

* Encapsulamiento
* Herencia
* Polimorfismo
* Abstracción

---

# Funcionalidades del Sistema

## Login de Acceso

El sistema incluye una pantalla de autenticación.

### Credenciales

Usuario:

```text
admin
```

Contraseña:

```text
1234
```

---

## Dashboard Principal

El sistema cuenta con un dashboard moderno que muestra:

* Productos
* Ventas
* Clientes
* Ganancias

---

## Gestión de Productos

El sistema permite:

* Agregar productos
* Ver carrito
* Facturar productos
* Eliminar productos

---

## Gestión de Clientes

El sistema permite:

* Registrar clientes
* Ver clientes registrados
* Eliminar clientes

---

## Interfaz Gráfica

La aplicación fue desarrollada utilizando Java Swing e incluye:

* Botones interactivos
* Dashboard dinámico
* Imágenes de productos
* Paneles personalizados
* Colores modernos
* Diseño estilo premium

---

# Tecnologías Utilizadas

## Lenguaje de Programación

* Java

## IDE Utilizado

* Apache NetBeans IDE

### Descargar NetBeans

[https://netbeans.apache.org/download/index.html](https://netbeans.apache.org/download/index.html)

---

## JDK Utilizado

* Java JDK 17 o superior

### Descargar JDK

[https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

---

## Control de Versiones

* Git
* GitHub

### Descargar Git

[https://git-scm.com/downloads](https://git-scm.com/downloads)

---

# Librerías Utilizadas

El proyecto utiliza únicamente librerías estándar de Java:

* javax.swing
* java.awt
* java.util.ArrayList

No se utilizaron librerías externas.

---

# Estructura del Proyecto

```text
SneakersStorePremium/
│
├── src/
│   ├── imagenes/
│   ├── main/
│   ├── modelos/
│   └── vistas/
│
├── nbproject/
├── build.xml
├── manifest.mf
└── README.md
```

---

# Explicación de las Carpetas

## src/modelos

Contiene las clases orientadas a objetos:

* Persona
* Cliente
* Administrador
* Producto

---

## src/vistas

Contiene las interfaces gráficas:

* Login
* VentanaPrincipal

---

## src/imagenes

Contiene las imágenes de los tenis utilizadas en el sistema.

---

# Implementación de Programación Orientada a Objetos

## Encapsulamiento

Se utilizaron atributos privados en las clases.

Ejemplo:

```java
private String nombre;
private double precio;
```

---

## Herencia

Las clases Cliente y Administrador heredan de Persona.

Ejemplo:

```java
public class Cliente extends Persona
```

---

## Polimorfismo

Se utilizó Override para redefinir métodos.

Ejemplo:

```java
@Override
public void mostrarDatos()
```

---

## Abstracción

La clase Persona representa una abstracción general de usuario.

---

# Cómo Ejecutar el Proyecto

## Paso 1

Descargar el proyecto desde GitHub.

---

## Paso 2

Descomprimir el archivo ZIP.

---

## Paso 3

Abrir Apache NetBeans IDE.

---

## Paso 4

Ir a:

```text
File → Open Project
```

---

## Paso 5

Seleccionar la carpeta:

```text
SneakersStorePremium
```

---

## Paso 6

Presionar:

```text
Open Project
```

---

## Paso 7

Ejecutar el proyecto.

Puede ejecutarse de dos formas:

### Opción 1

Presionar el botón verde RUN.

---

### Opción 2

Click derecho al proyecto:

```text
Run Project
```

---

# Funcionamiento del Sistema

## Login

El usuario debe iniciar sesión con:

```text
Usuario: admin
Contraseña: 1234
```

---

## Dashboard

Una vez dentro del sistema, el usuario podrá:

* Visualizar productos
* Agregar productos
* Eliminar productos
* Facturar
* Registrar clientes
* Eliminar clientes
* Ver clientes registrados

---

# Imágenes Utilizadas

Las imágenes de los tenis fueron agregadas dentro de:

```text
src/imagenes
```

Formatos utilizados:

* PNG

---

# Requisitos del Sistema

Para ejecutar correctamente el proyecto se requiere:

* Java JDK 17 o superior
* Apache NetBeans IDE
* Sistema Operativo Windows

---

# GitHub

El proyecto fue subido a GitHub para facilitar:

* Descarga
* Ejecución
* Revisión del código
* Evaluación del proyecto

---

# Conclusión

Sneakers Store Premium es un proyecto académico desarrollado para demostrar conocimientos en Programación Orientada a Objetos utilizando Java.

El sistema implementa interfaces gráficas modernas, gestión dinámica de productos y clientes, así como estructuras orientadas a objetos aplicando buenas prácticas de programación.
