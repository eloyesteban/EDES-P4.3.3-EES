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
