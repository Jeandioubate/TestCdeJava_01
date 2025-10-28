# 1. Objectif du programme
Ce programme lit un nombre entier fourni soit en ligne de commande, soit saisi par l'utilisateur et indique, s'il est positif, négatif ou nul; et s'il est pair ou impair.

# 2. Fonctionnement

* Avec argument en ligne de commande
On peut passer la valeur directement lors de l'exécution.

* Sans argument, avec saisie utilisateur
Si aucun argument n'est donné, le programme demande la saisie manuelle

# 3. Structure du code

* args : permet de récupérer les arguments passés en ligne de commande
* Scanner : lit les saisies clavier si aucun argument n'est fourni
* matches("-?\\d+") : vérifie que la valeur saisie est bien un entier.
* Integer.parseInt() : convertit la chaîne de caractère en entier
* Conditions if / else : détermnine le signe et la parité du nombre.

# 4. Compilation et exécution

* Compiler
```bash```
```
javac Test.java
```
* Exécuter avec un argument
```bash```
```
java Test 8
```
* Sans argument
```bash```
```
java Test
````

