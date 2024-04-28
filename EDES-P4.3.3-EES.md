## Analizadores de Código Estático (Linting)

![img.png](assets%2Fimg.png)

Los analizadores de código estático, también conocidos como herramientas de Linting, son programas que escanean nuestro código e informan sobre problemas de sintaxis y estilo. Su objetivo es asegurar el cumplimiento de una serie de reglas de estilo y buenas prácticas que hacen más legible nuestro código, especialmente en trabajo colaborativo.

### Listado de Diferencias:

![img_1.png](assets%2Fimg_1.png) ![img_2.png](assets%2Fimg_2.png)

#### Enfoque:
- **Ktlint:** Estilo y formato del código usando las guías básicas de estilo en Kotlin.
- **Detekt:** Analiza problemas más complejos como la complejidad del código y malas prácticas.

#### Corrección Automática:
- **Ktlint:** Corrige automáticamente errores de estilo y formato.
- **Detekt:** No corrige automáticamente, identifica y reporta problemas.

#### Configurabilidad:
- **Ktlint:** Configuración limitada, menos flexible.
- **Detekt:** Altamente configurable.

### Instalación de Herramientas en IntelliJ:

#### Ktlint:
1. Acceder al proyecto: `File` > `Settings`.

![img_3.png](assets%2Fimg_3.png)

2. En la ventana `Plugins`, acceder a la pestaña `MarketPlace` y buscar `Ktlint`.

![img_4.png](assets%2Fimg_4.png)

3. Pulsar el botón `Install`.

4. Repetir los pasos `File` -> `Settings` y en `Tools` configurar la herramienta.

![img_5.png](assets%2Fimg_5.png)

[Más información sobre configuración y detalles de uso de Ktlint](https://pinterest.github.io/ktlint/latest/)

#### Detekt:
1. Seguir los mismos pasos hasta el `MarketPlace` y buscar `Detekt`, instalar de la misma forma.

![img_6.png](assets%2Fimg_6.png)

[Más información sobre Detekt](https://detekt.dev/)

En secciones posteriores, se explorarán procesos de configuración y los beneficios que estos pueden aportar a nuestro código.

### Errores Localizados

Tras pasar `Ktlint` a nuestro código, detectamos varios errores. En el archivo Bingo.kt, localizamos una cantidad de 10 errores. De estos 10 vámos a seleccionar 5, vámos a explicar lo que sucede y la solución.

#### Missing space after `//`.

Sucede que `Ktlint` detecta que para tener un buen formato de escritura en el código, debemos dejar espacios después de la barra de comentarios.

#### Needless Blank line(s).

Hay líneas en blanco innecesarias las cuales debemos de eliminar.

#### Unexpected Identation.

La identación de nuestro código no coincide con la estructura que estamos siguiendo.

#### File must end with a newline (\n).

Nuestro archivo debe de terminar con una nueva línea vacía al final.

#### Unexpected blank line(s) before "}".

Hay lineas en blanco justo antes de cierres que no deberían de estar.

Aplicaremos la autocorrección de Ktlint para que soluciones nuestros problemas.

## Resolver Preguntas

1. 1.a ¿Que herramienta has usado, y para que sirve? 1.b ¿Cuales son sus características principales? 1.c ¿Qué beneficios obtengo al utilizar dicha herramienta?

En esta práctica mencionamos dos herramientas, `Ktlint` y `Detekt` y como mencionamos anteriormente analizan nuestro codigo para corregir problemas de estilo. Sus características principales son la capacidad de revisar nuestro código,
de avisarnos de los errores de estilo que tenemos y en el caso de `ktlint` la capacidad de corregir los errores automáticamente. Como beneficios obtenemos la capacidad de mantener un estilo claro y normalizado en el mundo de la programación.

2. 2.a De los errores/problemas que la herramienta ha detectado y te ha ayudado a solucionar, ¿cual es el que te ha parecido que ha mejorado más tu código? 2.b ¿La solución que se le ha dado al error/problema la has entendido y te ha parecido correcta? 2.c ¿Por qué se ha producido ese error/problema?

Por lo general, de los errores detectados por `Ktlint` y `Detekt`, aunque en la practica los errores que aparecen son detectados por `Ktlint`, son similares, en el sentido de que corrige errores de estilos. Sin embargo, alguno de los errores que me informaba
`Detekt` mencionaba variables mal usadas y la solución que debiamos realizar. Los errores seleccionados los entiendo perfectamente y considero que el problema de que aparezcan los errores es que estamos en etapa de aprendizaje, era la primera vez que trabajabamos en 
equipos y cada uno tiene su estilo de programar, además de la falta de costumbre de construir un código cuando cada persona realiza una parte.

3. 3.a ¿Que posibilidades de configuración tiene la herramienta? 3.b De esas posibilidades de configuración, ¿cuál has configurado para que sea distinta a la que viene por defecto? 3.c Pon un ejemplo de como ha impactado en tu código, enlazando al código anterior al cambio, y al posterior al cambio.

Viendo las documentaciones de cada herramienta, ambas tienen bastantes aspectos configurables, he tenido ciertos problemas con la estructura del repositorio y de ciertos archivos que no me han permitido explorar tanto este aspecto. La principal configuración qu ehe cambiado es que `Ktlint` no me cambiara los errores automáticamete, para yo poder seleccionarlos manuelmente
y luego por consola identificarlos y mandar al autocorrector a solucionarlo.

4. 4 ¿Qué conclusiones sacas después del uso de estas herramientas?

Las conclusiones que saco después del uso de estas herramientas es que son herramientas muy útiles, sobre todo en programadores que acaban de empezar, leas ayuda a evitar errores en el estilo y seguir un estandar o normalización a la hora de programar. Considero que es una capacidad que se obtiene en base a la experiencia, pero con estas dos herramientas o el resto que no mencioanmos en la prática,
o mejor dicho la técnica del Linting, nos facilita en el aprendizaje.