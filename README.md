# Escuela Colombiana de Ingeniería Julio Garavito - Arquitecturas Empresarial ARSW - Primer Trabajo

# Introduction to complex systems, JAVA, MVN, AND GIT

## Descripcion

  Este programa calcula la media y desviacion estandar usando una implementacion propia de LinkedList.
 
## Diseño

  This is the intended design for this project
  
  ![Diseño](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/Design.png)
  

## Guia
  
  ### Requisitos
  
  Es necesario tener en tu maquina local:
  
  * Maven 
  * Java 
  * Git
 
 ### Como usarlo?
  En primer lugar vamos a descargar el repositorio en nuestra máquina local, y en la carpeta de 
nuestra preferencia. En consola vamos a digitar el siguiente comando para clonar el repositorio.

```
git clone https://github.com/nicolasOL/Introduccion-MVN-GIT.git
```

Entremos a el directorio del proyecto

```
cd Introduccion-MVN-GIT
```

Debemos compilar el proyecto, que contiene las clases necesarias para poder correr la app. Por medio de maven vamos a crear todos los compilables **.class**. Desde consola, y ubicados en la carpeta donde se encuentra nuestra configuración de maven.

```
mvn compile
```

Ahora que nuestras clases etan compiladas vamos a ejecutar la clase principal para
ver el código en acción :

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.introduccion.main"
```
Los datos del programa provienen de algún archivo de texto 
con números decimales.
   
## Pruebas   
Para ejecutar las pruebas es necesario ejecutar:
```
mvn test
```      
Las pruebas van a ser ejecutadas con los dos datasets adjuntos:

![test1](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/datos-1.JPG)

![test2](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/datos-2.JPG)

Esperamos obtener los siguientes resultados:

![test3](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/datos-esperados.JPG)     

Pruebas propuestas:

![test3](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/Prueba-mean.JPG) 

![test4](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/Prueba-sd.JPG)  

Pruebas ejecutandose satisfactoriamente:

![test5](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/images/Pruebas-pasadas.JPG)

     
    
## Java Documentation
  
In order to get additional information about this project you can use JavaDoc to get the Documentation.
The documentation of this project is located in this [site]()
  
  ## Author
  
  Nicolas Ortega Limas
  
  ## License
  
  This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](https://github.com/nicolasOL/Introduccion-MVN-GIT/blob/master/LICENSE.txt)
