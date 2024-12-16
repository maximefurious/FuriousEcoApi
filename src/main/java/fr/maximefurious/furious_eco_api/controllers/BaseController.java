package fr.maximefurious.furious_eco_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {
    @RequestMapping("/")
    public String index() {
        return "Bienvenue sur l'API FuriousEco !" +
                "<br>" +
                "Pour exécuter le script de mise à jour des prix, rendez-vous sur /api/script/executer";
    }
}
