<?php
 // Inclure le contrôleur et le modèle
 require_once 'controllers/EtablissementController.php';
 require_once 'models/Etablissement.php';
 // Vérifier l'URL demandée
$action = isset($_GET['action']) ? $_GET['action'] : 'index';
 // Instancier le contrôleur
 $controller = new EtablissementController();
 // Router vers l'action appropriée
 switch ($action) {
 case 'index':
 $controller->index();
 break;
 case 'create':
 $controller->create();
 break;
 case 'store':
 $controller->store();
 break;
 case 'edit':
 $id = isset($_GET['id']) ? $_GET['id'] : null;
 $controller->edit($id);
 break;
 case 'update':
 $id = isset($_GET['id']) ? $_GET['id'] : null;$controller->update($id);
 break;
 case 'delete':
 $id = isset($_GET['id']) ? $_GET['id'] : null;
 $controller->delete($id);
 break;
 default:
 // Action par défaut si aucune correspondance trouvée
echo 'Page non trouvée';
 }
?>
