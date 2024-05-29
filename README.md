# Gestión de Dietas en Java

Este proyecto de Java permite gestionar las dietas de empleados en una empresa. Incluye funcionalidades para crear una tabla de dietas en una base de datos MySQL, insertar registros, consultar datos específicos y actualizar dietas.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)

## Requisitos

- Java Development Kit (JDK) 8 o superior
- MySQL Server
- Conector JDBC para MySQL

## Instalación

1. Clona este repositorio en tu máquina local.
2. Configura tu servidor MySQL y crea una base de datos llamada `Empresa`.
3. Añade el conector JDBC de MySQL a tu proyecto. Puedes descargarlo desde [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/).
4. Actualiza las credenciales de la base de datos en la clase `DatabaseManager` con tu usuario y contraseña de MySQL.

## Uso

1. Compila y ejecuta el programa.
2. El programa realizará las siguientes acciones:
    - Conectará a la base de datos `Empresa`.
    - Creará la tabla `Dietas` si no existe.
    - Insertará 10 registros en la tabla `Dietas`.
    - Consultará y mostrará por pantalla las dietas de empleados del departamento de Informática mayores de 30 €.
    - Incrementará en un 10% las dietas del departamento de Ventas.


