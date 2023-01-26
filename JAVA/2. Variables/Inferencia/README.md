### Literal

Los valores literales son aquellos que podemos asignar a las variables. Dependiendo del tipo de variable podremos asignar unos valores u otros.

* Literales numéricas
  Pueden ser de tipo *int, double, long, float*

```java
int miVariableEntera = 10;
```

* Literales Booleanas
  Consiste en las palabras reservadas true y false

```java
boolean miVariableBooleana = true;
```

* Literales de Carácteres
  Las literales de caracteres se expresan por un solo caracter entre comillas sencillas

```java
char miVariablChar = 'a';
```

* Literales de Cadena
  Una cadena es una combinación de caracteres. Las cadenas en Java son instancias de la clase  **String** , por ello cuentan con métodos que permiten combinar, probar y modificar cadenas con facilidad.
  Las literales de cadena se representan por una secuencia de caracteres entre comillas dobles.

```java
String miVariableString = "Hola mundo";
```

### Referencia

[Literales - UNAM](http://profesores.fi-b.unam.mx/carlos/java/java_basico2_4.html#:~:text=Una%20literal%20es%20un%20valor,y%20las%20cadenas%20de%20caracteres.)

[Literales - ManualWeb](https://www.manualweb.net/java/literales-java/)


### VAR

La palabra clave Var se introdujo en Java 10. La inferencia de tipo se usa en la palabra clave var en la que detecta automáticamente el tipo de datos de una variable en función del contexto circundante.

Se puede utilizar var para :

* Declarar cualquier tipo de datos
* Usar en una declaración de variable local


**NO** se puede utilizar var :

* En una declaración de instancia y variable global.
* Como ó con el tipo genérico
* Sin una inicialización explícita.
* Con expresiones Lambda
* Para parámetros de método y tipo de devolución

### Referencia

[Var - Barcelona Geeks](https://barcelonageeks.com/var-palabra-clave-en-java/)
