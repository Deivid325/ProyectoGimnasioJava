# Descripción General de las Mejoras
El programa original para gestionar un gimnasio ha sido mejorado mediante la introducción de nuevas funcionalidades y una mejor organización del código. Las principales mejoras incluyen:

⚪Clase Usuario: Se creó una clase dedicada para representar a los usuarios registrados en el gimnasio, permitiendo una mejor estructura y escalabilidad.
⚪Listado de usuarios registrados: Se añadió un método mostrarUsuariosRegistrados en la clase Gimnasio que lista todos los usuarios inscritos junto con su información básica, como el nombre y la edad.
⚪Registro con datos adicionales: Ahora los usuarios pueden registrarse indicando también su edad, lo que permite personalizar y gestionar mejor la información.

# Justificación de los Cambios Realizados
1️⃣Modularidad: La introducción de la clase Usuario separa las responsabilidades y mejora la claridad del código. Esto permite agregar nuevos atributos o funcionalidades relacionadas con los usuarios en el futuro sin afectar la clase Gimnasio.
2️⃣Escalabilidad: El almacenamiento de usuarios en una lista (usuariosRegistrados) hace que el programa pueda gestionar múltiples usuarios de forma eficiente.
3️⃣Funcionalidad Extendida: La posibilidad de mostrar los usuarios registrados y recopilar datos adicionales, como la edad, mejora la utilidad del programa al proporcionar información relevante para la administración del gimnasio.
