# INF4063-01-Structures-des-informations-I

Le but du devoir est de réaliser que certains problèmes à solution par essais successifs peuvent
être résolus par la programmation dynamique.

Votre restaurant italien sert beaucoup de repas sur la base de tomates et vous devez en acheter
une quantité importante de temps en temps. Vous pouvez les acheter dans un magasin qui offre
des sacs de tomates de différentes quantités (exprimées en kilogrammes). Chaque type de sac de
tomates coute un prix, exprimé en dollars. Votre but est de faire un achat de la quantité désirée de
tomates qui minimisera votre cout payé total. Il est possible que les sacs plus grands reviennent
au prix moins cher au kilogramme (ce qui arrive souvent en pratique) ou bien au prix plus élevés
par kilogramme (rarement en pratique). Vous pouvez aussi acheter une quantité totale de tomates
plus grande que nécessaire et jeter les tomates qui vous restent si le prix ainsi payé sera inferieur.

Entrée:

Votre programme aura en entrée les données suivantes. Dans la première ligne on aura une valeur
entière exprimant le nombre de cas à suivre. Pour chaque cas on aura ensuite une séquence de
lignes suivantes:
- la première ligne contient un entier n qui exprime le nombre de types de sacs de tomates
disponibles au magasin,
- chacune de n lignes suivantes contiendra deux nombres spécifiant les paramètres d’un type de
sac de tomates, le premier étant son poids, le second - son prix. vous pouvez supposer, que ces
n lignes viendrons en ordre croissant de poids,
- la dernière ligne doit contenir la quantité totale q de tomates que vous devez acheter.

Sortie.

Votre programme doit afficher le cout total pour chaque cas de l’entrée. Dans le cas de tomates
non utilisées le programme doit aussi afficher la quantité de tomates jetées.

Dans l’entête de votre programme vous devez estimer la complexité de votre algorithme en
fonction de deux paramètres d’entrée: n et q (et possiblement d’autres - selon votre jugement).


Exemple de l’entrée.
2
3
1 2
5 8
10 13
18
4
3 3
10 7
13 8
17 10
20

Exemple de sortie.

Le cout total de 18 kilogrammes de tomates est 26 dollars. 2 kilogrammes de tomates seront
jettes. Le cout total de 20 kilogrammes de tomates est 13 dollars.

Barème:
3/10 analyse du problème et fonctionnement général du programme
3/10 optimalité de la solution et l’affichage correct
2/10 estimations correctes de la complexité algorithmique
2/10 méthodologie et style de programmation (noms, commentaires, indentation, ...)

En plus, 3 points bonis seront attribués à l’étudiant proposant la solution la plus efficace, 2
points bonis pour la deuxième solution la plus efficace et 1 point boni pour le troisième. Pour
évaluer le temps d’exécution de votre programme suivez la méthode donnée aux laboratoires.
