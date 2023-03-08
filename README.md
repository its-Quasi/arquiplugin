<img src="img/BotNeoDesign.png" align="right" />

# PomoBeans: Temporizador para NetBeans ![Awesome](https://cdn.jsdelivr.net/gh/sindresorhus/awesome@d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)

## Tabla de Contenidos📑
1. [Introducción 👨‍💻](#introducción)
2. [Instalación :boom:](#instalación-boom)
3. [Configuracion ⚙️](#configuración-%EF%B8%8F)
4. [Tecnologías y Herramientas ⚙️](#tecnologías-y-herramientas%EF%B8%8F)
5. [Licencia 📫](#licencia-)
6. [Institución Académica 🏫](#institución-académica-)
7. [Autor(es) ✒️](#autores-%EF%B8%8F)

## Introducción👨‍💻
PomoBeans es una herramienta de gestión del tiempo que te ayuda a optimizar tu productividad. Su característica principal es un reloj pomodoro que te ayuda a tomar tiempos de descanso y trabajar en bloques de tiempo determinados para maximizar tu eficiencia. Además, puedes darle uso para establecer un tiempo para realizar una tarea específica. Con esta función, puedes establecer un tiempo objetivo para una tarea. Es fácil de usar y se integra perfectamente con tu flujo de trabajo, lo que lo convierte en una herramienta esencial para cualquier persona que busque aumentar su productividad y mejorar su enfoque en las tareas importantes.

## Instalación :boom:

Abrimos una consola de Gitbash o línea de comandos y copiamos el siguiente comando.

```git
git clone https://github.com/its-Quasi/arquiplugin.git
```

## Configuración ⚙️

1. Abrimos el proyecto en el IDE NetBeans
2. Una vez abierto el proyecto seguimos la siguiente ruta:
```bash
├───pomobeans
   └───Important Files
        └───Per-user NetBeans Platform Config
            └───user.properties.file
```
3. Una vez ingresamos a  `user.properties.file` veremos el siguiente código:
```python
user.properties.file=C:\\Users\\'USER'\\AppData\\Roaming\\NetBeans\\'VERSION'\\build.properties
```
4.  Procedemos a cambiar las siguientes palabras: 
```python 
la palabra 'USER' debera ser cambiada por el usuario en el cual esta iniciada la sesion
```
```python 
la palabra 'VERSION' debera ser cambiada por la version actual de netbeans que tenga en su PC
```
5. Luego de realizar los cambios debemos dar clic derecho en nuestro proyecto/plugin y dar clic en: 
```
Install/Reload in Development IDE
```

## Tecnologías y Herramientas⚙️
### El proyecto se desarrollo con las siguientes tecnologías y herramientas:
|   	NOMBRE|   	DESCRIPCIÓN|    ICONO|
|---	|---	|---   |
|   	[NetBeans](https://netbeans.apache.org/) | 	NetBeans es un entorno de desarrollo integrado libre, hecho principalmente para el lenguaje de programación Java. Existe además un número importante de módulos para extenderlo. NetBeans IDE​ es un producto libre y gratuito sin restricciones de uso.|<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Apache_NetBeans_Logo.svg/800px-Apache_NetBeans_Logo.svg.png" height="50px" alt="NetBeans">| 
|   	[Java](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n)) |  Java es una plataforma informática de lenguaje de programación creada por Sun Microsystems en 1995. Ha evolucionado desde sus humildes comienzos hasta impulsar una gran parte del mundo digital actual, ya que es una plataforma fiable en la que se crean muchos servicios y aplicaciones. Los nuevos e innovadores productos y servicios digitales diseñados para el futuro también siguen basándose en Java.|<img src="img/Java-Logo.png" height="80px" alt="Java">|

## Licencia 📫
![Licencia](https://img.shields.io/badge/Licencia-MTI-blue)

## Institución Académica 🏫
Plugin de NetBeans desarrollado para la materia de arquitectura de software [Programa de Ingeniería de Sistemas](<https://ingsistemas.cloud.ufps.edu.co/>) de la [Universidad Francisco de Paula Santander](<https://ww2.ufps.edu.co/>).

## Autores ✒️
Proyecto desarrollado por:
- Santiago Felipe Alferez Villamizar (**santiagofelipeavil@ufps.edu.co**)
- Carlos Eduardo Contreras Mendoza (**carloseduardocmen@ufps.efu.co**)
- Harold Rueda Antolinez (**haroldrant@ufps.edu.co**)
- Oscar Ivan Bayona Diaz (**oscarivanbdia@ufps.edu.co**)
