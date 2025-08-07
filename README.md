 Encriptador de Archivos con AES128 en Java - Zuñiga Alejandro Univerisdad Autónoma del Perú

Este proyecto es una práctica de ciberseguridad donde se implementa un sistema de cifrado y descifrado de texto utilizando el algoritmo AES (Advanced Encryption Standard) de 128 bits.

 Propósito: 
este proyecto fue realizado con fines educativos para reforzar mi aprendizaje de la ciberseguridad, orientandome a crear un generar de claves para encriptacion de archivos. 

 Procesos de Funcionamiento: 
 Crea una clave aleatoria segura con `SecureRandom`.
 Cifra un texto en memoria utilizando AES128.
 Convierte el texto cifrado en Base64 para facilitar su visualización.
 Descifra el mensaje nuevamente para comprobar la integridad del proceso.

  Tecnologías utilizadas
Java 17+ (compatible con JDK 24)
NetBeans (IDE)
Maven (estructura del proyecto)
Librerías estándar de Java: `javax.crypto`, `java.security`, `java.util.Base64`

Seguridad
El sistema no sibe ni almacena ni una clave privadaa.
La clave se genera de forma aleatoria cada vez que se ejecuta el programa.
Solo se cifran los textos definidos; no se manipulan archivos aún.

Estructura del proyecto
```bash
Encriptador_de_Archivos_AES/
│
├── src/
│   └── Ciberseguridad/
│       ├── AESutils.java   # Clase de cifrado y descifrado
│       └── Main.java       # Clase principal de ejecución
├── nbproject/              # Configuración de NetBeans
├── build/                  # Archivos compilados (no esenciales)
├── pom.xml                 # Archivo Maven del proyecto
