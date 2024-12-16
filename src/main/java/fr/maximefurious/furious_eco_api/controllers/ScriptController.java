package fr.maximefurious.furious_eco_api.controllers;

import fr.maximefurious.furious_eco_api.services.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/script")
public class ScriptController {

    @Autowired
    private ScriptService scriptService;

    @GetMapping("/executer")
    public ResponseEntity<String> executerScript() {
        try {
            String resultat = scriptService.lancerScript();
            return ResponseEntity.ok(resultat);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Erreur lors de l'exécution du script : " + e.getMessage());
        }
    }
}