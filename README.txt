Deliveloo

Deliveloo est une application qui a pour objectif principal d�optimiser des tourn�es effectu�es par des cyclistes qui vont chercher des colis pour les livrer. Cette application est inspir�e d�un projet r�el pilot� par le Grand Lyon et visant � optimiser la mobilit� durable en ville (voir www.optimodlyon.com). 
Lors du lancement de l�application un plan de la ville de Lyon est charg� puis l�utilisateur peut s�lectionner une demande de livraisons � r�aliser. Celle-ci est affich�e relativement au plan. L�utilisateur peut ensuite calculer la tourn�e optimale pour cette demande. Les informations relatives aux horaires de livraisons sont alors indiqu�es et une feuille de route destin�e au livreur avec le trajet � emprunter est g�n�r�e. Pour finir l�utilisateur peut modifier la demande charg�e en supprimant ou ajoutant des livraisons. La tourn�e est alors recalcul�e en essayant de minimiser l�impact sur les autres livraisons et leurs horaires.�


Technologies
L�application utilise le composant mapjfx et OpenLayers pour l�affichage de la carte, des marqueurs, labels et des lignes de trajets. Plus d�informations sur le projet mapjfx sont disponibles ici�: site de sothawo.


Lancer l�application
Pour utiliser l�application il faut d�compresser l�archive DelivelooCode.zip, ouvrir le projet avec un IDE et Run la classe Main du projet. 
Le code est dores et d�j� compil�, si vous souhaitez le compiler de nouveau il faut veiller � disposer d�un IDE avec mvn.


Principaux cas d�utilisation

Charger et afficher un plan
Au lancement de l�application, un plan de la ville de Lyon est affich�e. Les donn�es cartographiques sont stock�es dans une m�moire cache pour plus d�efficacit�. La carte est interactive et utilise des donn�es d�Open Street Map. 

Interactions�:
- Se d�placer sur la carte par drag and drop avec la souris 
- Zoomer gr�ce � la molette de la souris, le slider de zoom ou bien en cliquant sur ��Zoom initial�� 
- Recadrer la carte comme initialement en cliquant sur ��Recadrer la carte��
- Charger un autre plan en cliquant sur ��Changer Plan�� et en s�lectionnant le fichier .xml correspondant au format d�un plan.

Charger et visualiser une demande
Vous pouvez charger un fichier XML d�crivant des livraisons � effectuer. Il vous suffit pour cela de cliquer sur le bouton ��Charger demande�� puis de s�lectionner votre fichier .xml de demande. L�application visualise alors la position de chaque adresse (de d�part, et des points d�enl�vement et de livraison) sur le plan gr�ce � des marqueurs de couleur. Une couleur correspond � une livraison. Une fl�che vers le bas indique un point de d�p�t alors qu�une fl�che vers le haut indique un point d�enl�vement. L�entrep�t est signal� par un drapeau.

Calculer et visualiser une tourn�e
Vous pouvez demander � calculer une tourn�e qui part de l�adresse de d�part, visite les points d�enl�vement et de livraison (de sorte que, pour chaque demande, le point d�enl�vement soit visit� avant le point de livraison), et revient � l�adresse de d�part. La dur�e de la tourn�e est �gale au temps n�cessaire pour parcourir l�ensemble de ses tron�ons, plus la dur�e de tous les enl�vements et livraisons.

Pour effectuer le calcul de la tourn�e optimale (de dur�e minimale) il vous faut cliquer sur le bouton ��Calculer tourn�e��.
Un indicateur vous indique alors que le calcul est en cours et les tourn�es s�affichent progressivement. Vous pouvez interrompre ce calcul � tout moment en cliquant sur ��STOP��. 

Modifier une demande et la tourn�e calcul�e correspondante
Vous pouvez modifier la tourn�e en supprimant des livraisons ou en ajoutant de nouvelles livraisons.�Apr�s chaque modification, le syst�me met � jour la nouvelle tourn�e calcul�e qui minimise les changements de livraisons et leurs horaires par rapport � la tourn�e pr�c�dente.

Pour supprimer une livraison, s�lectionnez la livraison � supprimer en cliquant sur un de ses 2 points (d�p�t ou enl�vement) dans le panneau de d�tails des livraisons, puis cliquez sur ��Supprimer��.

Pour ajouter une livraison, cliquez sur ��Ajouter�� puis faites un clic-droit sur la carte � l�endroit o� vous souhaitez ajouter le point d�enl�vement, puis un cli-droit � l�endroit du point de d�p�t et enfin entrez les dur�es de livraison et d�enl�vement correspondante dans la fen�tre qui s�est ouverte � cet effet.

G�n�rer une feuille de route
Une fois la tourn�e calcul�e, vous pouvez g�n�rer une feuille de route du trajet pour le livreur. Un fichier .txt contenant les informations relatives au trajet � effectuer (nom de rue, distance � parcourir, � quelle intersection tourner et dans quelle direction) est alors export�.
Pour g�n�rer la feuille de route il faut cliquer sur le bouton ��Feuille de route�� puis s�lectionner le dossier o� exporter le fichier.


Naviguer dans l�historique des tourn�es
Vous pouvez � tout moment naviguer dans l�historique des tourn�es calcul�es en cliquant sur les fl�ches �pr�c�dent� ou �suivant�. La tourn�e pr�c�dente ou suivante est ainsi affich�e et remplace la pr�c�dent. 

