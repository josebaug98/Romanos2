# Romanos2
Elaborado por: José Osmar Bautista García
Correo:jose.baug98@gmail.com

Elaborar un programa en consola Java que convierta un número entero en un rango de 1 a 1000 introducido por el usuario a su representación en numeración romana, tomando en
cuenta las siguientes reglas:
1. Los números romanos I, X, C y M pueden repetirse hasta tres veces a la hora de escribir
un número romano compuesto.
2. Los números romanos V, L y D no pueden repetirse nunca.
3. Si un número romano compuesto tiene un número a la derecha menor que el de la
izquierda entonces se suman ambos. Ejemplo:
XI: el número de la derecha (I = 1) es menor que el de la izquierda (X = 10) entonces
se suman, es decir XI = 11
4. Si un número romano compuesto tiene un número a la derecha mayor que el de la
izquierda y éste es un I, X o C, entonces se resta el de la izquierda al de la derecha.
Ejemplo:
IX: el número de la derecha (X = 10) es mayor que el de la izquierda (I = 1) y además
este es I luego se resta el de la izquierda al de la derecha, es decir IX = 9

Instrucciones:
EL programa solicita un numero indo-árabigo y lo convierte en romano. Seguidamente pregunta si se desea agregar mas números o salir.
