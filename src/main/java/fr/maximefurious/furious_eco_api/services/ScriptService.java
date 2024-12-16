package fr.maximefurious.furious_eco_api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class ScriptService {
    private static final String NEW_PATCH_FILE_PATH = "C:/Users/maxim/Desktop/Patch éco/Patch economie 2024-12-13";
    private static final String OLD_PATCH_FILE_PATH = "C:/Users/maxim/Desktop/Patch éco/Patch economie 2024-10-14";

    private static final Logger logger = LoggerFactory.getLogger(ScriptService.class);

    public String lancerScript() throws IOException, InterruptedException {
        // on lance le script java Main dans ../tabledesprix/Main.java


        // on lance le script .jar est dans le projet dans le dossier jar
        ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", "src/main/java/fr/maximefurious/furious_eco_api/jar/TableDesPrix.jar", NEW_PATCH_FILE_PATH, OLD_PATCH_FILE_PATH);
        // on affiche les logs du script dans la console
        processBuilder.redirectErrorStream(true);
        processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        Process process = processBuilder.start();
        process.waitFor();


        // une fois que le script est terminé, on récupère le résultat changement_job.xlsx et voilà
        return "Script exécuté avec succès";
    }
}