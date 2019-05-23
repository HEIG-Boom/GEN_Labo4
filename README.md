# Laboratoire 4 : Refactoring

Auteurs : Loris Gilliand, Mateo Tutic, Luc Wachter

## But
Le but de ce laboratoire est de mettre en oeuvre les techniques de refactoring vues lors des deux derniers cours. Le code à améliorer est dans le répertoire Code Source Original. En particulier le fichier OrdersWriter.java, mais cela requiert certainement de modifier les autres fichiers et d'en créer / supprimer. Vous devez respecter les contraintes suivantes.

- Créez un projet Maven pour ce code
- Stockez ce projet sur GitHub
- Ne commitez que du code passant les tests de OrdersWriterTest
- Vérifiez la contrainte ci-dessus avec Travis

## Tâche
Appliquez les refactorings un par un, en commitant chaque changement. Pour chaque commit, indiquez dans le message du commit le nom du refactoring appliqué, la classe/méthode/attribut/... auquel il est appliqué, et éventuellement quel mauvaise odeur vous incite à l'appliquer.

Pour information, j'ai appliqué entre 15 et 20 refactorings à ce code. Il ne serait pas choquant que vous en appliquez un rien moins au beaucoup plus selon la granularité de vos commits.

## Résultats

Pour ce laboratoire, nous avons nommé nos commits en respectant le format ci-dessous : 

```<Refactoring technic> - <Class>.<Method> - <Bad code smells (if explicit)> ```

## Résumé

Durant le labo, nous avons rencontré les mauvaises odeurs suivantes :

+ Switch statement
+ Long method
+ Method in the wrong places
+ Message chains
+ Wrong name