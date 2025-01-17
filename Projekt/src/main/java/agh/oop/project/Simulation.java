package agh.oop.project;

import agh.oop.project.model.Specifications;
import agh.oop.project.model.Vector2d;
import agh.oop.project.model.animals.Animal;
import agh.oop.project.model.animals.CrazyAnimal;
import agh.oop.project.model.animals.NormalAnimal;
import agh.oop.project.model.app.MapChangeListener;
import agh.oop.project.model.worlds.ForestedEquator;
import agh.oop.project.model.worlds.LiveGivingCorpse;
import agh.oop.project.model.worlds.WorldMap;

import java.util.ArrayList;
import java.util.List;

public class Simulation implements Runnable {

    private final Specifications specifications;
    private final WorldMap worldMap;

    public Simulation(Specifications specifications, MapChangeListener presenter){
        this.specifications = specifications;
        if (specifications.normalGrowth()) worldMap = new ForestedEquator(specifications);
        else worldMap = new LiveGivingCorpse(specifications);
        worldMap.setListener(presenter);
        initSimulation();
    }

    public WorldMap getWorldMap() {
        return worldMap;
    }

    public void initSimulation() {

        for(int i = 0; i < specifications.startingAmountOfAnimals(); i++){
            worldMap.placeAnimal(
                specifications.normalGenome() ? new NormalAnimal(specifications)
                        : new CrazyAnimal(specifications));
        }

        worldMap.generatePlants(specifications.startingAmountOfPlants());

    }
    public void dayCycle() {
        /*
        1) usunięcie martwych zwierząt
        2) ruch zwierzaków
        3) jedzenie
        4) rozmnażanie się
        5) wzrost nowych roslin
        */
        worldMap.removeDeadAnimals();
        worldMap.moveAllAnimals();
        worldMap.eatingAndReproduction();
        worldMap.generatePlants(specifications.dailyPlantGrowth());
    }
    @Override
    public void run() {

        int simLength = 100;
        try {
            for (int i = 0; i < simLength; i++) {
                dayCycle();
                Thread.sleep(200);
                if (worldMap.getLivingAnimalAmount() == 0) break;
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
